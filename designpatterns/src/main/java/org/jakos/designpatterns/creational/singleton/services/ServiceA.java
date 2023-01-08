package org.jakos.designpatterns.creational.singleton.services;

import org.jakos.designpatterns.creational.singleton.singletonobjects.EarlySingleton;
import org.jakos.designpatterns.creational.singleton.singletonobjects.LazySingleton;

public class ServiceA {

    public EarlySingleton getEarlySingletonInstance() {
        return EarlySingleton.getEarlySingletonService(this.getClass());
    }

    public LazySingleton getLazySingletonInstance() {
        return LazySingleton.getLazySingleton(this.getClass());
    }
}
