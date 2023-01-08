package org.jakos.designpatterns.creational.singleton;

import org.jakos.designpatterns.creational.singleton.services.ServiceA;
import org.jakos.designpatterns.creational.singleton.services.ServiceB;
import org.jakos.designpatterns.creational.singleton.singletonobjects.EarlySingleton;
import org.jakos.designpatterns.creational.singleton.singletonobjects.LazySingleton;

public class SingletonMain {
    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        EarlySingleton earlySingletonInstanceA = serviceA.getEarlySingletonInstance();
        EarlySingleton earlySingletonInstanceB = serviceB.getEarlySingletonInstance();

        if (earlySingletonInstanceA.equals(earlySingletonInstanceB)) {
            System.out.println("It is a true early loaded singleton!");
        }

        LazySingleton lazySingletonInstanceA = serviceA.getLazySingletonInstance();
        LazySingleton lazySingletonInstanceB = serviceB.getLazySingletonInstance();

        if (lazySingletonInstanceA.equals(lazySingletonInstanceB)) {
            System.out.println("It is a true lazily loaded singletion!");
        }
    }
}
