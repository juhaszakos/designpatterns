package org.jakos.designpatterns.behavioral.chainofresponsibility.services.base;

import lombok.AccessLevel;
import lombok.Getter;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.InputDto;

public abstract class HandlerService implements ServiceInterface {

    @Getter(value = AccessLevel.PROTECTED)
    private ServiceInterface nextToHandle;

    protected HandlerService() {}

    @Override
    public void handleCall(InputDto input) {
        if (input == null || input.getInput().isBlank() || input.getLevel() == null) {
            System.out.println(this.getClass().getSimpleName() + " input insufficient to handle");
        }
        handle(input);
    }

    protected void setNextToHandle(final ServiceInterface nextToHandle) {
        if (nextToHandle == null) {
            return;
        }
        this.nextToHandle = nextToHandle;
    }

    protected abstract void handle(final InputDto input);
}
