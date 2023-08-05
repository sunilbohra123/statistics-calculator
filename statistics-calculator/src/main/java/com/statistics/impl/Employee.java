package com.statistics.impl;

import java.util.Objects;

public class Employee extends Person {
    private final String role;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return java.util.Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), role);
    }

    public Employee(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
}
