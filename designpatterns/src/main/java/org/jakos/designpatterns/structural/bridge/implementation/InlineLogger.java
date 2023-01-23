package org.jakos.designpatterns.structural.bridge.implementation;

import org.jakos.designpatterns.structural.bridge.implementation.base.Logger;

public class InlineLogger implements Logger {
    @Override
    public void doLog(String input) {
        System.out.print("I am the InlineLogger. ");
        System.out.print("I log the input in one line with my messages. ");
        System.out.print(input);
    }
}
