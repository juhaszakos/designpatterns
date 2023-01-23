package org.jakos.designpatterns.structural.composite;

import org.jakos.designpatterns.structural.composite.component.Employee;
import org.jakos.designpatterns.structural.composite.composite.BigBoss;
import org.jakos.designpatterns.structural.composite.composite.Boss;
import org.jakos.designpatterns.structural.composite.leaf.Engineer;

import java.util.Arrays;
import java.util.Collections;

public class CompositeMain {
    public static void main(String[] args) {

        Employee dev1 = new Engineer("Thomas", 21);
        Employee dev2 = new Engineer("Eve", 25);
        Employee dev3 = new Engineer("Jackie", 50);

        Employee manager1 = new Boss("Mag", 32, Arrays.asList(dev1, dev2));
        Employee manager2 = new Boss("James", 50, Collections.singletonList(dev3));

        Employee ceo = new BigBoss("Harlem", 70, Arrays.asList(manager1, manager2));

        ceo.printSubordinates();
        System.out.println("-----");
        manager1.printSubordinates();
        System.out.println("-----");
        dev2.printSubordinates();

    }
}
