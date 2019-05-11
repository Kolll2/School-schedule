package com.company.schoolclass;

import com.company.scheduling.Schedule;

import java.util.ArrayList;

public class SchoolClass {
    //список 1 класса
    //класс формируется из совокупности учеников
    //сокращенная интерпритация класса
    //название, колличество детей и приоритетный класс
    //п одсписок групп по изучению отдельных предметов

    public String name;
    public Integer  count;
    public String fixedClassRoom;
    //public ArrayList<SchoolClass> subGroupe;
    public Schedule schedule = new Schedule();

    /*public SchoolClass(String name, Integer count, String fixedClassRoom, ArrayList<SchoolClass> subGroupe) {
        this.name = name;
        this.count = count;
        this.fixedClassRoom = fixedClassRoom;
        this.subGroupe = subGroupe;
    }*/

    public SchoolClass(String s, int i, String fixedClassRoom) {
        this.name = s;
        this.count = i;
        this.fixedClassRoom = fixedClassRoom;
    }

}
