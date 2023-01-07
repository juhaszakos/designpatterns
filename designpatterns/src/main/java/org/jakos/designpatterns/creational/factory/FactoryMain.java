package org.jakos.designpatterns.creational.factory;

import org.jakos.designpatterns.creational.factory.factory.ServiceFactory;
import org.jakos.designpatterns.creational.factory.util.ServiceType;

public class FactoryMain {

    public static void main(String[] args) {
        ServiceFactory
                .getService(ServiceType.CAT)
                .doLog();

        ServiceFactory
                .getService(ServiceType.MOUSE)
                .doLog();
    }
}
