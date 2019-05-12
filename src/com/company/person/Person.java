package com.company.person;

import java.util.Objects;

public class Person {
    public Person(String firstName, String birthDate) {
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public String firstName;
    public String birthDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, birthDate);
    }
}
