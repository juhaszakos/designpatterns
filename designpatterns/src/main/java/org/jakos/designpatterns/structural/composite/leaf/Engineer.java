package org.jakos.designpatterns.structural.composite.leaf;

import org.jakos.designpatterns.structural.composite.component.EmployeeBean;
import org.jakos.designpatterns.structural.composite.util.Function;

import java.util.Collections;

public class Engineer extends EmployeeBean {
    public Engineer(String name, int age) {
        super(name, age, Function.WORKER, Collections.emptyList());
    }
}
