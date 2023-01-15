package org.jakos.designpatterns.creational.objectpool.objectpool.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {

     private ConcurrentLinkedQueue<T> pool;
     private ScheduledExecutorService poolInventoryService;
     private int minObjectCount;
     private int maxObjectCount;

     protected ObjectPool(int minObjectCount, int maxObjectCount) {
          this.minObjectCount = minObjectCount;
          this.maxObjectCount = maxObjectCount;
          pool = new ConcurrentLinkedQueue<>(initObjects());
          poolInventoryService = new ScheduledThreadPoolExecutor(1);
          poolInventoryService.scheduleAtFixedRate(this::checkInventory, 0l, 4l, TimeUnit.MILLISECONDS);
     }

     private ObjectPool() {}

     public T getObjectFromPool() {
          System.out.println("I will provide an object from the pool. Size: " + pool.size());
          return pool.poll();
     }

     public void returnObjectToPool(T object) {
          System.out.println("I will add back an object to the pool. Size: " + pool.size());
          pool.offer(object);
          System.out.println("I added back a class to the pool. Size: " + pool.size());
     }

     protected abstract T createObject();

     private void checkInventory() {
          System.out.println("Checking inventory!");
          if (pool.size() < minObjectCount) {
               System.out.println("Pool size is too small. Size: " + pool.size());
               maintainInventory(minObjectCount - pool.size());
          }
          if(pool.size() > maxObjectCount) {
               System.out.println("Pool size is too big. Size: " + pool.size());
               maintainInventory(maxObjectCount - pool.size());
          }
     }

     private void maintainInventory(int diff) {
          System.out.println("Pool is under maintenance. Size: " + pool.size() + " diff: " + diff);
          int count = 0;
          while (count++ < Math.abs(diff)) {
               if (diff < 0) {
                    pool.poll();
                    continue;
               }
               pool.offer(createObject());
          }
     }

     private List<T> initObjects() {
        int objectCount = 0;
        List<T> objectList = new ArrayList<>();
        while (objectCount < minObjectCount) {
             objectList.add(createObject());
             objectCount++;
        }
        return objectList;
     }
}
