package org.jakos.designpatterns.structural.decorator.wrapper;

import org.jakos.designpatterns.structural.decorator.base.ServiceInterface;

public class WrapperImplementation implements ServiceInterface {

    private ServiceInterface objectWrapped;

    public WrapperImplementation(ServiceInterface objectWrapped) {
        this.objectWrapped = objectWrapped;
    }

    @Override
    public void doLog() {
        System.out.println(this.getClass().getSimpleName() + " is extending the following: ");
        objectWrapped.doLog();
    }
}
