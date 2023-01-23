package org.jakos.designpatterns.structural.composite.composite;

import org.jakos.designpatterns.structural.composite.component.Employee;
import org.jakos.designpatterns.structural.composite.component.EmployeeBean;
import org.jakos.designpatterns.structural.composite.util.Function;

import java.util.List;

public class BigBoss extends EmployeeBean {
    public BigBoss(String name, int age, List<Employee> subordinates) {
        super(name, age, Function.OWNER, subordinates);
    }
}
