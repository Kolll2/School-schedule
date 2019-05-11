package com.company.lesson;

public class Lesson {
    public String name;
    public String teacherName;
    public String schoolClassName;
    public Integer load;

    public Lesson(String name, String teacherName, String schoolClassName, Integer load) {
        this.name = name;
        this.teacherName = teacherName;
        this.schoolClassName = schoolClassName;
        this.load = load;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", schoolClassName='" + schoolClassName + '\'' +
                ", load=" + load +
                '}';
    }
}
