package org.jakos.designpatterns.creational.abstractfactory.factory;

import org.jakos.designpatterns.creational.abstractfactory.util.MammalType;

import java.security.InvalidParameterException;

public class AbstractFactoryFactory {

    private AbstractFactoryFactory() {}

    public static AbstractFactory getFactory(MammalType mammalType) {
        switch (mammalType) {
            case DOG:
                return new DogFactory();
            case CAT:
                return new CatFactory();
            default:
                throw new InvalidParameterException(mammalType.getClass().getSimpleName() + "." + mammalType.name() + " is not handled yet!");
        }
    }
}
