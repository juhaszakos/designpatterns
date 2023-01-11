package org.jakos.designpatterns.creational.prototype.objects;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class BasicDto implements Prototype{

    private List<Long> longList;
    private String name;
    private boolean active;

    public BasicDto(List<Long> longList, String name, boolean active) {
        this.longList = longList;
        this.name = name;
        this.active = active;
    }

    @Override
    public Prototype clone() {
        return new BasicDto(
                new ArrayList<>(this.longList),
                new String(name),
                active
        );
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BasicDto)) {
            return false;
        }
        BasicDto other = (BasicDto) object;
        return  longList.equals(other.getLongList())
                && name.equals(other.getName())
                && active == other.isActive();
    }
}
