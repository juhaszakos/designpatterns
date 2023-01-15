package org.jakos.designpatterns.structural.adapter.adapter;

import org.jakos.designpatterns.structural.adapter.adaptee.UserLog;
import org.jakos.designpatterns.structural.adapter.objects.util.Level;
import org.jakos.designpatterns.structural.adapter.objects.util.Rating;
import org.jakos.designpatterns.structural.adapter.objects.util.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class UserLogWrapperBean extends UserLog implements UserLogWrapper {

    @Override
    public void logUser() {
        super.logUser();
    }

    @Override
    public void setLastLogin(Date lastLogin) {
        if (lastLogin == null) {
            return;
        }
        super.setLastLogin(LocalDateTime.ofInstant(lastLogin.toInstant(), ZoneId.systemDefault()));
    }

    @Override
    public void setRating(Rating rating) {
        if (rating == null) {
            return;
        }
        super.setRating(rating.getRatingValue());
    }

    @Override
    public void setLevel(Level level) {
        if (level == null) {
            return;
        }
        super.setLevel(level.getLevelValue());
    }

    @Override
    public void setUserData(User user) {
        if (user == null) {
            return;
        }
        super.setCurrentlyActive(user.getCurrentlyActive());
        super.setUserName(user.getUserName());
    }
}
