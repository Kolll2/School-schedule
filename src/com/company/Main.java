package com.company;

import com.company.dblayer.CSVDB;
import com.company.generator.GenerateClass;
import com.company.lesson.LessonQueueTests;
import com.company.scheduling.Scheduling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//254837
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        //CSVDB.writeInCSV("");
        System.out.println("All right");
        //CSVDB.readTeacherFromCSV();
        //CSVDB.writeSchoolClassInCSV(GenerateClass.genNewSchoolClass());
        CSVDB.writeSchedulingInCSV(new Scheduling());
        //CSVDB.writeSchoolClassInCSV(GenerateClass.genNewSchoolClass());

        /*LessonQueueTests lessonQueueTests = new LessonQueueTests();
        lessonQueueTests.mainTestLessonQueue();*/
    }
}
