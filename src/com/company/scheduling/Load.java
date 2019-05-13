package com.company.scheduling;

import com.company.lesson.Lesson;

public class Load {
    //нагрузка учителя

    public String nameLesson;
    public int lessonCount;

    public Load(String nameLesson, int lessonCount) {
        this.nameLesson = nameLesson;
        this.lessonCount = lessonCount;
    }
}
