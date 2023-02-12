package org.jakos.designpatterns.behavioral.chainofresponsibility.services;

import org.jakos.designpatterns.behavioral.chainofresponsibility.services.base.HandlerService;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.InputDto;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.Level;

public class WarningHandlerService extends HandlerService {

    @Override
    protected void handle(InputDto input) {
        if (!Level.WARNING.equals(input.getLevel())) {
            this.setNextToHandle(new InfoHandlerService());
            System.out.println(
                    this.getClass().getSimpleName()
                    + " I cannot handle this: " + input + " delegating it to: "
                    + this.getNextToHandle().getClass().getSimpleName());
            return;
        }
        System.out.println(this.getClass().getSimpleName() + " I can handle this: " + input);
    }
}
