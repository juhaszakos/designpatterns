package org.jakos.designpatterns.creational.abstractfactory.objects;

public class BigDog implements Dog{
    @Override
    public void bark() {
        System.out.println(this.getClass().getSimpleName() + " bark and bite");
    }
}
