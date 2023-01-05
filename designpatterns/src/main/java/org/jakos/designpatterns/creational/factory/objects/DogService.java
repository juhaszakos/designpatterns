package org.jakos.designpatterns.creational.factory.objects;

public class DogService implements BaseService{
    @Override
    public void doLog() {
        System.out.println(this.getClass().getSimpleName());
    }
}
