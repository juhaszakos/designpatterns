package org.jakos.designpatterns.creational.abstractfactory.util;

import org.jakos.designpatterns.creational.abstractfactory.factory.AbstractFactoryFactory;

public class MammalService {

    public void handleRequest(MammalType mammalType, AnimalSize animalSize) {
        int caughtNpe = 0;

        try {
            AbstractFactoryFactory
                    .getFactory(mammalType)
                    .createDog(animalSize)
                    .bark();
        }
        catch (NullPointerException nullPointerException) {
            caughtNpe++;
        }

        try {
            AbstractFactoryFactory
                    .getFactory(mammalType)
                    .createCat(animalSize)
                    .meow();
        }
        catch (NullPointerException nullPointerException) {
            caughtNpe++;
        }

        if (caughtNpe > 1) {
            throw new IllegalArgumentException(mammalType + " and " + animalSize + " might be invalid ");
        }
    }
}
