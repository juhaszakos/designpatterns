package org.jakos.designpatterns.behavioral.chainofresponsibility.services.base;

import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.InputDto;

public interface ServiceInterface {
    void handleCall(final InputDto input);
}
