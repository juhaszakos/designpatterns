package org.jakos.designpatterns.creational.factory.objects;

public class MouseService implements BaseService{
    @Override
    public void doLog() {
        System.out.println(this.getClass().getSimpleName());
    }
}
