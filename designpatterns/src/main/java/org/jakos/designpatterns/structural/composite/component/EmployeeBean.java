package org.jakos.designpatterns.structural.composite.component;

import lombok.ToString;
import org.jakos.designpatterns.structural.composite.util.Function;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ToString(onlyExplicitlyIncluded = true)
public abstract class EmployeeBean implements Employee{

    @ToString.Include
    protected String name;
    @ToString.Include
    protected int age;
    @ToString.Include
    protected Function function;
    protected List<Employee> subordinates;

    protected EmployeeBean(String name, int age, Function function, List<Employee> subordinates) {
        this.name = name;
        this.age = age;
        this.function = function;
        this.subordinates = subordinates;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Function getFunction() {
        return function;
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void printSubordinates() {
        Optional.ofNullable(getSubordinates())
                .orElseGet(Collections::emptyList)
                .forEach(employee -> {
                    System.out.println(employee.toString());
                    employee.printSubordinates();
                });
    }
}
