package org.jakos.designpatterns.creational.abstractfactory;

import org.jakos.designpatterns.creational.abstractfactory.factory.AbstractFactoryFactory;
import org.jakos.designpatterns.creational.abstractfactory.util.AnimalSize;
import org.jakos.designpatterns.creational.abstractfactory.util.MammalService;
import org.jakos.designpatterns.creational.abstractfactory.util.MammalType;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        AbstractFactoryFactory
                .getFactory(MammalType.CAT)
                .createCat(AnimalSize.BIG)
                .meow();

        AbstractFactoryFactory
                .getFactory(MammalType.DOG)
                .createDog(AnimalSize.SMALL)
                .bark();

        MammalService mammalService = new MammalService();

        mammalService.handleRequest(MammalType.DOG, AnimalSize.BIG);
    }
}
