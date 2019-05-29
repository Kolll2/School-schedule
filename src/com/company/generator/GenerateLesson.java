package com.company.generator;

import com.company.lesson.Lesson;
import com.company.lesson.LessonQueue;
import com.company.scheduling.Scheduling;

import java.util.ArrayList;

public class GenerateLesson {
    public static Lesson genNewLesson (){

        String name = "Russisan" + Math.round(Math.random()*10);
        String teacherName = "DoroninaAC";
        String schoolClassName = "15F";
        Integer load = (int) Math.round(Math.random()*10);

        return new Lesson(name, teacherName,schoolClassName,load);
    }

    public static Lesson randomLesson (){

        String[] teachers = {"Созина С.И.","Модестова А.Р.","Прошина М.А.","Савицкая Т.Н.",
        "Тулинцева Л.П.","Соколова Ж.Н.", "Улендеева Н.И.","Ануфриева Н.В.","Алексеева Т.","Артеменко О.В.",
        "Иванова Г.И.","Иванникова М.В."};
        String[] nameLesson = {"Русский язык","Литература","Немецкий язык","Английский язык","Математика",
        "История","Обществознание","География","Биология","Физика","Химия","Музыка","Изо-музыка","Информатика",
        "Самароведение","Технология","Физкультура","ОБЖ"};
        String name = nameLesson[(int) Math.round(Math.random()*(nameLesson.length-1))];
        String teacherName = teachers[(int) Math.round(Math.random()*(teachers.length-1))];
        String schoolClassName = "5A";
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
