package org.jakos.designpatterns.behavioral.chainofresponsibility.services;

import org.jakos.designpatterns.behavioral.chainofresponsibility.services.base.HandlerService;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.InputDto;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.Level;

public class ErrorHandlerService extends HandlerService {

    @Override
    protected void handle(InputDto input) {
        if (!Level.ERROR.equals(input.getLevel())) {
            this.setNextToHandle(new WarningHandlerService());
            System.out.println(
                    this.getClass().getSimpleName()
                            + " I cannot handle this: " + input + " delegating it to: "
                            + this.getNextToHandle().getClass().getSimpleName());
            this.getNextToHandle().handleCall(input);
            return;
        }
        System.out.println(this.getClass().getSimpleName() + " I can handle this: " + input);
    }
}
