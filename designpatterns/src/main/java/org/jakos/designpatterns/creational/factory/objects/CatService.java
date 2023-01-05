package org.jakos.designpatterns.creational.factory.objects;

public class CatService implements BaseService{
    @Override
    public void doLog() {
        System.out.println(this.getClass().getSimpleName());
    }
}
