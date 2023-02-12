package org.jakos.designpatterns.behavioral.chainofresponsibility.services.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class InputDto {
    private final String input;
    private final Level level;
}
