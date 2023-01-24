package org.jakos.designpatterns.structural.decorator;

import org.jakos.designpatterns.structural.decorator.base.ServiceImplementation;
import org.jakos.designpatterns.structural.decorator.base.ServiceInterface;
import org.jakos.designpatterns.structural.decorator.wrapper.WrapperImplementation;

public class DecoratorMain {
    public static void main(String[] args) {
        ServiceInterface serviceImplementation = new ServiceImplementation();
        System.out.println("---------");
        serviceImplementation.doLog();
        System.out.println("---------");
        ServiceInterface wrapperImplementation = new WrapperImplementation(serviceImplementation);
        wrapperImplementation.doLog();
    }
}
