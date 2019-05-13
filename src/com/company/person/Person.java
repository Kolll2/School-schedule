package com.company.person;

import java.util.Date;
import java.util.Objects;

public class Person {

    public String firstName;
    public Date birthDate;

    public Person(String firstName, Date birthDate) {
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

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
