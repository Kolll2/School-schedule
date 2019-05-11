package com.company.lesson;

import com.company.generator.GenerateLesson;

public class LessonQueueTests {
    public boolean mainTestLessonQueue (){

        LessonQueue lessonQueue = GenerateLesson.genNewLessonQueue();
        lessonQueue.printAllValues();
        System.out.println(lessonQueue.getLesson());
        System.out.println(lessonQueue.getHighLoadLesson());
        System.out.println(lessonQueue.getLowLoadLesson());

        return false;
    }
}
