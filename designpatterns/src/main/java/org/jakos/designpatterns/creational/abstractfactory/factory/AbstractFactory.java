package org.jakos.designpatterns.creational.abstractfactory.factory;

import org.jakos.designpatterns.creational.abstractfactory.objects.Cat;
import org.jakos.designpatterns.creational.abstractfactory.objects.Dog;
import org.jakos.designpatterns.creational.abstractfactory.util.AnimalSize;

public interface AbstractFactory {

    default Cat createCat(AnimalSize size) {
        return null;
    }
    default Dog createDog(AnimalSize size) {
        return null;
    }

    static void handleUnimplementedAnimalSize(AnimalSize size) {
        throw new IllegalArgumentException(size.getClass().getSimpleName() + "." + size.name() + " is not handled yet!");
    }
}
