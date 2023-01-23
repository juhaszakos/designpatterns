package org.jakos.designpatterns.structural.bridge;

import org.jakos.designpatterns.structural.bridge.abstraction.InlineNumberService;
import org.jakos.designpatterns.structural.bridge.abstraction.MultilineStringService;
import org.jakos.designpatterns.structural.bridge.abstraction.base.AbstractionBase;

public class BridgeMain {
    public static void main(String[] args) {
        AbstractionBase service1 = new MultilineStringService();
        AbstractionBase service2 = new InlineNumberService();
        service1.show();
        System.out.println("");
        service2.show();
    }
}
