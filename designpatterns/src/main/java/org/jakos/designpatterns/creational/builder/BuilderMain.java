package org.jakos.designpatterns.creational.builder;

import org.jakos.designpatterns.creational.builder.objects.ComplexDto;

import java.time.LocalDateTime;

public class BuilderMain {
    public static void main(String[] args) {
        ComplexDto dto = ComplexDto.builder()
                .activeSince(LocalDateTime.now())
                .address("Budapest")
                .name("Akos")
                .lastLogin(LocalDateTime.now())
                .build();

        System.out.println("dto: " + dto);
    }
}
