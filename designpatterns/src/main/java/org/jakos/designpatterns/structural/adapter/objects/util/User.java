package org.jakos.designpatterns.structural.adapter.objects.util;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private String userName;
    private Boolean currentlyActive;
}
