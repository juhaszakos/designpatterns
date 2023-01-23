package org.jakos.designpatterns.structural.composite.composite;

import org.jakos.designpatterns.structural.composite.component.Employee;
import org.jakos.designpatterns.structural.composite.component.EmployeeBean;
import org.jakos.designpatterns.structural.composite.util.Function;

import java.util.List;

public class Boss extends EmployeeBean {
    public Boss(String name, int age, List<Employee> subordinates) {
        super(name, age, Function.MANAGER, subordinates);
    }
}
