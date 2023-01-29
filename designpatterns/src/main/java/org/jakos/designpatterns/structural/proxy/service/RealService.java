package org.jakos.designpatterns.structural.proxy.service;

import org.jakos.designpatterns.structural.proxy.service.dto.ResourceDto;

public class RealService implements SomeService {
    @Override
    public ResourceDto loadResources(ResourceDto resource) {
        try {
            System.out.println("resource heavy computation started");
            Thread.sleep(100);
            resource.setName(resource.getName() + " computed");
            System.out.println("resource heavy computation finished");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        return resource;
    }
}
