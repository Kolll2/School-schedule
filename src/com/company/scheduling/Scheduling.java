package com.company.scheduling;

import com.company.generator.GenerateClass;
import com.company.lesson.LessonQueue;
import com.company.schoolclass.SchoolClass;

import java.util.ArrayList;
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

    public static LinkedList<SchoolClass> allSchoolClass = new LinkedList<>();

    public static void variableШnitialization(){
        //заполнение списка уроков.

    }
}
