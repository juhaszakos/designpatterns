package org.jakos.designpatterns.structural.bridge.abstraction.base;

import org.jakos.designpatterns.structural.bridge.implementation.base.Logger;
import org.jakos.designpatterns.structural.bridge.implementation.base.RandomGenerator;

public abstract class AbstractionBase {
    private final Logger logger;
    private final RandomGenerator randomGenerator;
    private final int length;

    protected AbstractionBase(Logger logger, RandomGenerator randomGenerator, int length) {
        this.length = length;
        this.logger = logger;
        this.randomGenerator = randomGenerator;
    }

    public abstract void show();

    protected void useCurrentServices() {
        String random = randomGenerator.genrateRandom(length);
        logger.doLog(random);
    }
}
