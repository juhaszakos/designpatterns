package org.jakos.designpatterns.structural.adapter.adaptee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class UserLog {
    private String userName;
    private LocalDateTime lastLogin;
    private Boolean currentlyActive;
    private Long rating;
    private Long level;

    public void logUser() {
        System.out.println(this);
    }

}
