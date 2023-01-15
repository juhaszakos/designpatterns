package org.jakos.designpatterns.structural.adapter.adapter;

import org.jakos.designpatterns.structural.adapter.objects.util.Level;
import org.jakos.designpatterns.structural.adapter.objects.util.Rating;
import org.jakos.designpatterns.structural.adapter.objects.util.User;

import java.util.Date;

public interface UserLogWrapper {
    void logUser();
    void setLastLogin(Date lastLogin);
    void setRating(Rating rating);
    void setLevel(Level level);
    void setUserData(User user);
}
