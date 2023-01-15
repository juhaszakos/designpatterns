package org.jakos.designpatterns.creational.objectpool;

import org.jakos.designpatterns.creational.objectpool.objectpool.CatTestPool;
import org.jakos.designpatterns.creational.objectpool.objects.CatService;

public class ObjectPoolMain {
    public static final int MIN_OBJECT_COUNT = 1;
    public static final int MAX_OBJECT_COUNT = 3;
    public static void main(String[] args) {
        CatTestPool catTestPool = new CatTestPool(MIN_OBJECT_COUNT, MAX_OBJECT_COUNT);

        int count = 0;
        while (count++ < 12) {
            Thread thread = new Thread(() -> {
                try {
                    while (true) {
                        CatService catService = catTestPool.getObjectFromPool();
                        Thread.sleep(15);
                        if (catService != null) {
                            catService.makeCatNoise();
                            Thread.sleep(5);
                            catTestPool.returnObjectToPool(catService);
                        }
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
        }
    }
}
