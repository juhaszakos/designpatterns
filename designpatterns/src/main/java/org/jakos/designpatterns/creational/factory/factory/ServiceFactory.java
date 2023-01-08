package org.jakos.designpatterns.creational.factory.factory;

import org.jakos.designpatterns.creational.factory.services.BaseService;
import org.jakos.designpatterns.creational.factory.services.CatService;
import org.jakos.designpatterns.creational.factory.services.DogService;
import org.jakos.designpatterns.creational.factory.services.MouseService;
import org.jakos.designpatterns.creational.factory.util.ServiceType;

import java.security.InvalidParameterException;

public class ServiceFactory {

    private ServiceFactory() {}

    public static BaseService getService(ServiceType serviceType) {

        switch (serviceType) {
            case CAT:
                return new CatService();
            case DOG:
                return new DogService();
            case MOUSE:
                return new MouseService();
            default:
                throw new InvalidParameterException("ServiceType isn't provided by the factory yet!");
        }
    }
}
