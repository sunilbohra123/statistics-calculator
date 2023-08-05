package com.statistics.impl;

import java.util.Objects;

public class Person {
    private final int age;
    private final String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Person person = (Person) object;
        return age == person.age &&
                java.util.Objects.equals(name, person.name);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), age, name);
    }
}

