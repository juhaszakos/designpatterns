package org.jakos.designpatterns.structural.flyweight.factory;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.jakos.designpatterns.structural.flyweight.objects.Service;
import org.jakos.designpatterns.structural.flyweight.objects.ServiceA;
import org.jakos.designpatterns.structural.flyweight.objects.ServiceB;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory {

    private Map<ImmutablePair<Long, Class<? extends  Service>>, Service> instances;

    public ServiceFactory() {
        instances = new HashMap<>();
    }

    public Service getService(ImmutablePair<Long, Class<? extends Service>> serviceIdentity) {
        return checkInventory(serviceIdentity);
    }

    private Service checkInventory(ImmutablePair<Long, Class<? extends Service>> serviceIdentity) {
        Service service = instances.get(serviceIdentity);
        if (service == null) {
            System.out.println("no such service stored yet: " + serviceIdentity);
            return createNewService(serviceIdentity.getLeft(), serviceIdentity.getRight());
        }
        return service;
    }

    private Service createNewService(Long id, Class<? extends Service> serviceClass) {
        Service service = null;
        if (serviceClass.equals(ServiceA.class)) {
            service = new ServiceA(id);
        }
        else if (serviceClass.equals(ServiceB.class)) {
            service = new ServiceB(id);
        }
        else {
            StringBuilder builder = new StringBuilder("class of: ");
            builder.append(serviceClass);
            builder.append("is not handled yet!");
            throw new IllegalArgumentException(builder.toString());
        }
        instances.put(ImmutablePair.of(id, service.getClass()), service);
        return service;
    }
}
