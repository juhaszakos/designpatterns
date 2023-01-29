package org.jakos.designpatterns.structural.flyweight.objects;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class ServiceB extends Service {

    public ServiceB(Long serviceId) {
        super(serviceId);
    }

    @Override
    protected ImmutablePair<Long, Class<? extends Service>> getIdentity() {
        return ImmutablePair.of(this.serviceId, this.getClass());
    }
}
