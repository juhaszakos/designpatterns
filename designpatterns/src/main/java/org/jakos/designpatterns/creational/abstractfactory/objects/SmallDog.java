package org.jakos.designpatterns.creational.abstractfactory.objects;

public class SmallDog implements Dog{
    @Override
    public void bark() {
        System.out.println(this.getClass().getSimpleName() + " high pitch bark");
    }
}
