package com.company.person;

import com.company.lesson.Lesson;
import com.company.scheduling.Load;

import java.util.Date;

public class Teacher extends Person {
    public String fixedClassRoom;
    public Load[] loads;

    public Teacher(String firstName, Date birthDate, Load[] loads) {
        super(firstName, birthDate);
        this.loads = loads;
    }

    public Teacher(String firstName, Date birthDate) {
        super(firstName, birthDate);
    }

    public Teacher(String firstName, Date birthDate, String fixedClassRoom) {
        super(firstName, birthDate);
        this.fixedClassRoom = fixedClassRoom;
    }

    public void setLoads(Load[] loads) {
        this.loads = loads;
    }

    public String genCSVDate(){

        return firstName+"#"+birthDate+"#"+fixedClassRoom;
    }

    public void toText (){

    }

    public static void getDefaultTeacher (){
        //method return basic list of Teacher

    }
}
