package org.jakos.designpatterns.creational.prototype;

import org.jakos.designpatterns.creational.prototype.objects.BasicDto;

import java.util.Arrays;

public class PrototypeMain {
    public static void main(String[] args) {
        BasicDto original = new BasicDto(Arrays.asList(10l, 11l, 12l), "original", true);
        BasicDto copy = (BasicDto) original.clone();
        System.out.println("original: " + original);
        System.out.println("copy: " + original);
        if (copy.equals(original)) {
            System.out.println("Their contents are equal!");
        }
        if (copy == original) {
            System.out.println("And they are the same object");
        }
        else {
            System.out.println("Even though they are not the same objects!");
        }
    }
}
