package org.jakos.designpatterns.creational.objectpool.objects;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CatService {

    private Long age;
    private String name;

    public void makeCatNoise() {
        System.out.println("meow by: " + name + " age: " + age);
    }
}
