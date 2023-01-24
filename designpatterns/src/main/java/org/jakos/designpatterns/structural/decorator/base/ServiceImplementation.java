package org.jakos.designpatterns.structural.decorator.base;

public class ServiceImplementation implements ServiceInterface {
    @Override
    public void doLog() {
        System.out.println(this.getClass().getSimpleName() + " has the basic functions.");
    }
}
