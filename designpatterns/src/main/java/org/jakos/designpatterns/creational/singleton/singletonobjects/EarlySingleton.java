package org.jakos.designpatterns.creational.singleton.singletonobjects;

public class EarlySingleton {

    private static final EarlySingleton EARLY_SINGLETON = new EarlySingleton();

    private EarlySingleton() {}

    public static EarlySingleton getEarlySingletonService(Class<?> serviceClass) {
        System.out.println(serviceClass + " called me, but I have already been created");
        return EARLY_SINGLETON;
    }
}
