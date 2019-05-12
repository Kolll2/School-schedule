package com.company.generator;

import com.company.schoolclass.SchoolClass;

import java.util.ArrayList;

public class GenerateClass {
    public static SchoolClass genNewSchoolClass (){
        String name = "5A";
        Integer count = 24;
        String fixedClassRoom = "15";
        SchoolClass result = new SchoolClass(name, count,fixedClassRoom);
        for (int i = 0; i < 6; i++ ) {
        result.schedule.schedule[0][0] = "Russian";
        result.schedule.schedule[0][1] = "Literature";
        result.schedule.schedule[0][2] = "English";
        result.schedule.schedule[0][3] = "History";
        result.schedule.schedule[0][4] = "Biology";
        result.schedule.schedule[0][5] = "Music";
        result.schedule.schedule[0][6] = "Russian";
        result.schedule.schedule[0][7] = "Russian";
        result.schedule.schedule[0][8] = "Russian";}
        return new SchoolClass(name,count,fixedClassRoom);
    }

    /*public static SchoolClass genNewSchoolClass (){
        String name = "1";
        Integer count = 24;
        String fixedClassRoom = "15";
        ArrayList<SchoolClass> subGroupe= new ArrayList<>();
        for (int i = 1; i <4; i++){
            subGroupe.add(new SchoolClass(name+"#"+i, 24/3, fixedClassRoom));}
        return new SchoolClass(name,count,fixedClassRoom,subGroupe);
    }*/

    public static void initScoolClass (){

    }
}
