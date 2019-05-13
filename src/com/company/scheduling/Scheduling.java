package com.company.scheduling;

import com.company.generator.GenerateClass;
import com.company.lesson.Lesson;
import com.company.lesson.LessonQueue;
import com.company.person.Teacher;
import com.company.schoolclass.SchoolClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Scheduling {

    /**Формируем списки уроков по группам детей
     * далее перебираем группы и формируем расписание
     * по заданнм жестким ограничениям
     * используя генетических алгоритм переставляем несколько уроков
     * формируя геном и проверяя улучшилось ли расписание
     */

    //список 1 класса
    //класс формируется из совокупности учеников
    //сокращенная интерпритация класса
    //название колличество детей и приоритетный класс
    //подсписок групп по изучению отдельных предметов

    public static final int WORKDAY = 6;
    //number of school classes
    public static final int NOSC = 9;

    public static final int TOTL = 9;

    Lesson [][][] sharedSchedule = new Lesson[NOSC][WORKDAY][TOTL];



    public Scheduling() {
        this.sharedSchedule = generatorSharedSchedule();
    }

    public Scheduling(Lesson[][][] sharedSchedule) {
        this.sharedSchedule = sharedSchedule;

    }

    public static Lesson[][][] generatorSharedSchedule(){
        Lesson [][][] result = new Lesson[NOSC][WORKDAY][TOTL];
        int classCount = 1;
        int dayCount = 1;

        for (int i = 0; i < NOSC; i++){
            for (int i2 = 0; i2 < WORKDAY; i2++){
                for (int i3 = 0; i3 < TOTL; i3++){
                    result[i][i2][i3] = new Lesson("CHTO TO", "teacher name", "15" , 10);
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public void print() throws ParseException {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.sharedSchedule = generatorSharedSchedule();
        Lesson[][][] newP = generatorSharedSchedule();
        int classCount = 1;
        int dayCount = 1;
        Date date =  simpleDateFormat.parse("15-05-1995");
        newP[0][0][0] = new Lesson("111","name Teacher", "15",10);
        System.out.println(this.sharedSchedule);
        System.out.println(newP[0][0][0].name);
        System.out.println(this.getClass().getSimpleName());
        for (Lesson[][] klass : this.sharedSchedule) {
            System.out.print(classCount++ + "   ");
            for (Lesson[] day : klass) {
                System.out.println(dayCount++);
                for (Lesson lesson : day) {
                    System.out.println(lesson.name + " " + lesson.teacherName + " " + lesson.schoolClassName);
                }
            }
        }
        System.out.println("====END====");
    }
}
