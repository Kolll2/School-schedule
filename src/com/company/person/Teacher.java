package com.company.person;

public class Teacher extends Person {
    public String fixedClassRoom;

    public Teacher(String firstName, String birthDate, String fixedClassRoom) {
        super(firstName, birthDate);
        this.fixedClassRoom = fixedClassRoom;
    }

    public String genCSVDate(){

        return firstName+"#"+birthDate+"#"+fixedClassRoom;
    }
}
