package org.jakos.designpatterns.structural.flyweight;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jakos.designpatterns.structural.flyweight.factory.ServiceFactory;
import org.jakos.designpatterns.structural.flyweight.objects.Service;
import org.jakos.designpatterns.structural.flyweight.objects.ServiceA;
import org.jakos.designpatterns.structural.flyweight.objects.ServiceB;

public class FlyWeightMain {
    public static void main(String[] args) {
        ServiceFactory serviceFactory = new ServiceFactory();
        Service service1 = serviceFactory.getService(ImmutablePair.of(1L, ServiceB.class));
        Service service2 = serviceFactory.getService(ImmutablePair.of(2L, ServiceB.class));
        Service service12 = serviceFactory.getService(ImmutablePair.of(1L, ServiceB.class));
        Service service3 = serviceFactory.getService(ImmutablePair.of(1L, ServiceA.class));
        service1.identify();
        service2.identify();
        if (service1 == service12) {
            System.out.println("service1 and service12 are the same object");
        }
        service3.identify();
    }
}
