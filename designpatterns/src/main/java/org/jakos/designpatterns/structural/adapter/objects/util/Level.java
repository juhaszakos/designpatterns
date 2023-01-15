package org.jakos.designpatterns.structural.adapter.objects.util;

public enum Level {
    EXPERT(4L),
    SENIOR(3L),
    MEDIOR(2L),
    JUNIOR(1L);

    private long levelValue;

    Level(long levelValue) {
        this.levelValue = levelValue;
    }

    public long getLevelValue() {
        return levelValue;
    }
}
