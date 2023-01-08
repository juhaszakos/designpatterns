package org.jakos.designpatterns.creational.singleton.singletonobjects;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getLazySingleton(Class<?> serviceClass) {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
            System.out.println(serviceClass + " called me and created me");
        }
        else {
            System.out.println(serviceClass + " called me, but I have already been created");
        }
        return lazySingleton;
    }
}
