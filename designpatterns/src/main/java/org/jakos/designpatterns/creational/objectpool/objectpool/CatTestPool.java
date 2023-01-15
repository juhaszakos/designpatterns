package org.jakos.designpatterns.creational.objectpool.objectpool;

import org.jakos.designpatterns.creational.objectpool.objectpool.base.ObjectPool;
import org.jakos.designpatterns.creational.objectpool.objects.CatService;

import java.util.Random;

public class CatTestPool extends ObjectPool<CatService> {

    public CatTestPool(int minObjectCount, int maxObjectCount) {
        super(minObjectCount, maxObjectCount);
    }

    @Override
    protected CatService createObject() {
        Random random = new Random();
        return CatService.builder()
                .age(random.nextLong())
                .name((char)random.nextInt(128) + " " + (char)random.nextInt(128))
                .build();
    }
}
