package org.jakos.designpatterns.structural.proxy;

import org.jakos.designpatterns.structural.proxy.service.ProxyService;
import org.jakos.designpatterns.structural.proxy.service.RealService;
import org.jakos.designpatterns.structural.proxy.service.SomeService;
import org.jakos.designpatterns.structural.proxy.service.dto.ResourceDto;

public class ProxyMain {
    public static void main(String[] args) {
        SomeService service = new RealService();
        System.out.println(service.loadResources(new ResourceDto(1L, "test")));
        System.out.println("---------");
        SomeService proxy = new ProxyService();
        System.out.println(proxy.loadResources(new ResourceDto(1L, "test")));
        System.out.println("---------");
        try {
            System.out.println(proxy.loadResources(new ResourceDto(6L, "tooLarge")));

        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " -- authorized by proxy object");
        }
        System.out.println("---------");
        System.out.println(proxy.loadResources(new ResourceDto(1L, "test")));
    }
}
