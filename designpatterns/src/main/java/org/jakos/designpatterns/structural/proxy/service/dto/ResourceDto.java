package org.jakos.designpatterns.structural.proxy.service.dto;

import lombok.*;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ResourceDto {
    @Getter
    private Long id;
    @Setter
    @Getter
    @EqualsAndHashCode.Exclude
    private String name;
}
