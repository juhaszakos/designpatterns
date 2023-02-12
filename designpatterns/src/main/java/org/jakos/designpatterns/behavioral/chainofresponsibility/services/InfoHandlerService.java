package org.jakos.designpatterns.behavioral.chainofresponsibility.services;

import org.jakos.designpatterns.behavioral.chainofresponsibility.services.base.HandlerService;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.InputDto;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.Level;

public class InfoHandlerService extends HandlerService {

    @Override
    protected void handle(InputDto input) {
        if (!Level.INFO.equals(input.getLevel())) {
            this.setNextToHandle(new ErrorHandlerService());
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
