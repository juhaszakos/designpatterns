package org.jakos.designpatterns.creational.abstractfactory.objects;

public class BigCat implements Cat{
    @Override
    public void meow() {
        System.out.println(this.getClass().getSimpleName() + " meow and hiss");
    }
}
