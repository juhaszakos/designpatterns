package org.jakos.designpatterns.creational.abstractfactory.factory;

import org.jakos.designpatterns.creational.abstractfactory.objects.BigCat;
import org.jakos.designpatterns.creational.abstractfactory.objects.Cat;
import org.jakos.designpatterns.creational.abstractfactory.objects.SmallCat;
import org.jakos.designpatterns.creational.abstractfactory.util.AnimalSize;

public class CatFactory implements AbstractFactory{

    @Override
    public Cat createCat(AnimalSize size) {
        switch (size) {
            case BIG:
                return new BigCat();
            case SMALL:
                return new SmallCat();
            default:
                AbstractFactory.handleUnimplementedAnimalSize(size);
                return null;
        }
    }
}
