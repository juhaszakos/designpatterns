package org.jakos.designpatterns.creational.factory;

import org.jakos.designpatterns.creational.factory.factory.ServiceFactory;
import org.jakos.designpatterns.creational.factory.objects.BaseService;
import org.jakos.designpatterns.creational.factory.util.ServiceType;

public class FactoryMain {

    public static void main(String[] args) {
        ServiceFactory serviceFactory = new ServiceFactory();
        // business chooses the type that it needs
        BaseService service = serviceFactory.getService(ServiceType.CAT);
        service.doLog();
    }
}
