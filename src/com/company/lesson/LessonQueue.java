package com.company.lesson;

import java.util.ArrayList;

public class LessonQueue {
    public String schoolClass;
    private ArrayList<Lesson> lessonsQueue = new ArrayList<>();

    public LessonQueue(String schoolClass, ArrayList<Lesson> lessonsQueue) {
        this.schoolClass = schoolClass;
        this.lessonsQueue = lessonsQueue;
    }

    public Lesson getLesson (){
        return lessonsQueue.get(lessonsQueue.size()-1);
    }

    public Lesson getHighLoadLesson(){
        Lesson result = lessonsQueue.get(0);
        for (int i = 0; i < lessonsQueue.size();i++){
            if (result.load < lessonsQueue.get(i).load)
                result = lessonsQueue.get(i);
        }
        return result;
    }

    public Lesson getLowLoadLesson(){
        Lesson result = lessonsQueue.get(0);
        for (int i = 0; i < lessonsQueue.size();i++){
            if (result.load > lessonsQueue.get(i).load)
                result = lessonsQueue.get(i);
        }
        return result;
    }

    public String toString() {
        return "LessonQueue{" +
                "schoolClass='" + schoolClass + '\'' +
                ", lessonsQueue=" + lessonsQueue +
                '}';
    }

    public void printAllValues (){
        System.out.println("=====Print all values of LessonQueue size " +this.lessonsQueue.size());
        for (int i = 0; i < lessonsQueue.size();i++){
            System.out.println("index = " + i + " @ "+lessonsQueue.get(i).toString());
        }
    }

}
