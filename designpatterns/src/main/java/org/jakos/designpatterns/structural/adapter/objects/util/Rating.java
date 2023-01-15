package org.jakos.designpatterns.structural.adapter.objects.util;

public enum Rating {
    SUPER(5L),
    GOOD(4L),
    AVERAGE(3L),
    BAD(2L),
    WORST(1L);

    Rating(long ratingValue) {
        this.ratingValue = ratingValue;
    }

    private long ratingValue;

    public long getRatingValue() {
        return this.ratingValue;
    }
}
