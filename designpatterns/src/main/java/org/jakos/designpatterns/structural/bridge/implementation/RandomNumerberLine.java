package org.jakos.designpatterns.structural.bridge.implementation;

import org.jakos.designpatterns.structural.bridge.implementation.base.RandomGenerator;

import java.util.Random;

public class RandomNumerberLine implements RandomGenerator {
    @Override
    public String genrateRandom(int length) {
        StringBuilder buffer = new StringBuilder();
        int index = 0;
        while (index++ < Math.abs(length)) {
            Random random = new Random();
            int nextInt = 0;
            while (nextInt == 0) {
                nextInt = random.nextInt(10);
            }
            buffer.append(nextInt);
        }
        return buffer.toString();
    }
}
