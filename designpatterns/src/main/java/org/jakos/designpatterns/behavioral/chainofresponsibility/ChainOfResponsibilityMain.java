package org.jakos.designpatterns.behavioral.chainofresponsibility;

import org.jakos.designpatterns.behavioral.chainofresponsibility.services.InfoHandlerService;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.base.HandlerService;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.InputDto;
import org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils.Level;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        HandlerService handlerService = new InfoHandlerService();
        InputDto inputDto = new InputDto("this is a big error", Level.ERROR);
        handlerService.handleCall(inputDto);

        InputDto inputDto2 = new InputDto("this is just a warning", Level.WARNING);
        handlerService.handleCall(inputDto2);
    }
}
