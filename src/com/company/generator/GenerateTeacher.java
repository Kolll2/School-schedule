package com.company.generator;

import com.company.Main;
import com.company.person.Teacher;

import java.time.Instant;
import java.util.Date;
import java.util.Timer;

public class GenerateTeacher {
    public static Teacher genNewTeacher (){
        String firstName = "Alisa" + Math.round(Math.random()*10);
        String birthDate = Instant.now().toString();
        String fixedClassRoom = "A" + Math.round(Math.random()*100);

        return new Teacher(firstName,birthDate,fixedClassRoom);
    }
}
