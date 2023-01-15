package org.jakos.designpatterns.structural.adapter;

import org.jakos.designpatterns.structural.adapter.adapter.UserLogWrapper;
import org.jakos.designpatterns.structural.adapter.adapter.UserLogWrapperBean;
import org.jakos.designpatterns.structural.adapter.objects.util.Level;
import org.jakos.designpatterns.structural.adapter.objects.util.Rating;
import org.jakos.designpatterns.structural.adapter.objects.util.User;

import java.util
        .Date;

public class AdapterMain {
    public static void main(String[] args) {
        UserLogWrapper userLog = new UserLogWrapperBean();

        User user = User.builder()
                .currentlyActive(true)
                .userName("Thomas")
                .build();

        userLog.setUserData(user);
        userLog.setLastLogin(new Date());
        userLog.setLevel(Level.EXPERT);
        userLog.setRating(Rating.SUPER);

        userLog.logUser();
    }
}
