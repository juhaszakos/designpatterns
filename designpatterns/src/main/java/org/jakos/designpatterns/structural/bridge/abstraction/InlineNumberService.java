package org.jakos.designpatterns.structural.bridge.abstraction;

import org.jakos.designpatterns.structural.bridge.abstraction.base.AbstractionBase;
import org.jakos.designpatterns.structural.bridge.implementation.InlineLogger;
import org.jakos.designpatterns.structural.bridge.implementation.RandomNumerberLine;

public class InlineNumberService extends AbstractionBase {

    public InlineNumberService() {
        super(new InlineLogger(), new RandomNumerberLine(), 15);
    }

    @Override
    public void show() {
        super.useCurrentServices();
    }
}
