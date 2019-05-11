package com.company.generator;

import com.company.lesson.Lesson;
import com.company.lesson.LessonQueue;

import java.util.ArrayList;

public class GenerateLesson {
    public static Lesson genNewLesson (){

        String name = "Russisan" + Math.round(Math.random()*10);
        String teacherName = "DoroninaAC";
        String schoolClassName = "15F";
        Integer load = (int) Math.round(Math.random()*10);

        return new Lesson(name, teacherName,schoolClassName,load);
    }

    public static LessonQueue genNewLessonQueue(){
        ArrayList<Lesson> lessonArrayList = new ArrayList<>();
        for (int i = 0 ; i < 20; i++){
            lessonArrayList.add(genNewLesson());
        }
        return new LessonQueue("5A",lessonArrayList);
    }
}
