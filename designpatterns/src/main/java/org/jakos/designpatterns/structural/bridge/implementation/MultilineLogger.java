package org.jakos.designpatterns.structural.bridge.implementation;

import org.jakos.designpatterns.structural.bridge.implementation.base.Logger;

public class MultilineLogger implements Logger {
    @Override
    public void doLog(String input) {
        System.out.println("I am the MultilineLogger.");
        System.out.println("I log the input an my messages in new lines.");
        System.out.println(input);
    }
}
