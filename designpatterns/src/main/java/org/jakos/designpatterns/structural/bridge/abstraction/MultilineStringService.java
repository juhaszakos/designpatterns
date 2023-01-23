package org.jakos.designpatterns.structural.bridge.abstraction;

import org.jakos.designpatterns.structural.bridge.abstraction.base.AbstractionBase;
import org.jakos.designpatterns.structural.bridge.implementation.MultilineLogger;
import org.jakos.designpatterns.structural.bridge.implementation.RandomStringLine;

public class MultilineStringService extends AbstractionBase {

    public MultilineStringService() {
        super(new MultilineLogger(), new RandomStringLine(), 15);
    }

    @Override
    public void show() {
        super.useCurrentServices();
    }
}
