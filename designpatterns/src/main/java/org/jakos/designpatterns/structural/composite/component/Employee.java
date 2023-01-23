package org.jakos.designpatterns.structural.composite.component;

import org.jakos.designpatterns.structural.composite.util.Function;
import java.util.List;

public interface Employee {
    void printSubordinates();
    String getName();
    int getAge();
    Function getFunction();
    List<Employee> getSubordinates();
    String toString();
}
