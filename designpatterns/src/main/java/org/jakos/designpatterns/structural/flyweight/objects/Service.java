package org.jakos.designpatterns.structural.flyweight.objects;

import org.apache.commons.lang3.tuple.ImmutablePair;

public abstract class Service {
    protected Long serviceId;
    protected abstract ImmutablePair<Long, Class<? extends Service>> getIdentity();

    protected Service(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void identify() {
        System.out.println("identity: " + getIdentity().getKey() + " class: " + getIdentity().getValue());
    }

}
