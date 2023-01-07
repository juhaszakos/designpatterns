package org.jakos.designpatterns.creational.abstractfactory.factory;

import org.jakos.designpatterns.creational.abstractfactory.objects.BigDog;
import org.jakos.designpatterns.creational.abstractfactory.objects.Dog;
import org.jakos.designpatterns.creational.abstractfactory.objects.SmallDog;
import org.jakos.designpatterns.creational.abstractfactory.util.AnimalSize;

public class DogFactory implements AbstractFactory{

    @Override
    public Dog createDog(AnimalSize size) {
       switch (size) {
           case BIG:
               return new BigDog();
           case SMALL:
               return new SmallDog();
           default:
               AbstractFactory.handleUnimplementedAnimalSize(size);
               return null;
       }
    }
}
