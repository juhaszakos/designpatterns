package org.jakos.designpatterns.structural.bridge.implementation;

import org.jakos.designpatterns.structural.bridge.implementation.base.RandomGenerator;

import java.util.Random;

public class RandomStringLine implements RandomGenerator {
    @Override
    public String genrateRandom(int length) {
        StringBuilder buffer = new StringBuilder();
        int index = 0;
        while (index++ < Math.abs(length)) {
            Random random = new Random();
            int randomInt = random.nextInt(90 - 65) + 65;
            buffer.append((char) randomInt);
        }
        return buffer.toString();
    }
}
