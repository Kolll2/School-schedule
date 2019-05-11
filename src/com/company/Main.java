package com.company;

import com.company.dblayer.CSVDB;
import com.company.generator.GenerateClass;
import com.company.lesson.LessonQueueTests;

import java.io.FileNotFoundException;
import java.io.IOException;
//254837
public class Main {

    public static void main(String[] args) throws IOException {
        //CSVDB.writeInCSV("");
        System.out.println("All right");
        //CSVDB.readLessonsTRFromCSV();

        CSVDB.writeSchoolClassInCSV(GenerateClass.genNewSchoolClass());

        /*LessonQueueTests lessonQueueTests = new LessonQueueTests();
        lessonQueueTests.mainTestLessonQueue();*/
    }
}
