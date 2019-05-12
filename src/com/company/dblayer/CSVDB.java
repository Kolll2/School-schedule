package com.company.dblayer;

import com.company.generator.GenerateTeacher;
import com.company.schoolclass.SchoolClass;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVDB {
    public static void writeInCSV (String str){
        String csv = "C:\\school schedule\\TeacherBD.csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(csv))) {
            GenerateTeacher generateTeacher = new GenerateTeacher();
            for (int i = 0; i< 10; i++){
                String[] teacher = generateTeacher.genNewTeacher().genCSVDate().split("#");
                writer.writeNext(teacher);
            }
            /*String[] country = "India#China#United States".split("#");

            writer.writeNext(country);
            country[0] += "#1"; country[1] += "#1"; country[2] += "#1";
            writer.writeNext(country);
            country[0] += "#1"; country[1] += "#1"; country[2] += "#1";
            writer.writeNext(country);*/
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void readFromCSV () throws IOException {
        String csvFilename = "C:\\school schedule\\TeacherBD3.csv";
        FileReader reader = new FileReader(csvFilename);
        CSVReader csvReader = new CSVReader(reader, ';');
        String[] row = null;
        System.out.println("=============================");
        while((row = csvReader.readNext()) != null) {
            System.out.println(row[0]
                    + " # " + row[1]
                    + " #  " + row[2]);
        }

        reader.close();
        csvReader.close();
        System.out.println("=================================");
    }

    public static void readLessonsTRFromCSV() throws IOException{
        String csvFilename = "C:\\school schedule\\Lessons.csv";
        FileReader reader = new FileReader(csvFilename);
        CSVReader csvReader = new CSVReader(reader, ';');
        String[] row = null;
        System.out.println("====>READ LESSON TR<====");
        while((row = csvReader.readNext()) != null) {
            System.out.println(row[0]
                    + " ==> " + row[1]);
        }

        reader.close();
        csvReader.close();
        System.out.println("=================================");
    }

    public static void writeSchoolClassInCSV(SchoolClass schoolClass) throws IOException{
        String csv = "C:\\school schedule\\TeacherBD.csv";
        try (CSVWriter writer = new CSVWriter(new FileWriter(csv))) {
            GenerateTeacher generateTeacher = new GenerateTeacher();
            String[] allInfo = new String[3];
            allInfo[0] = schoolClass.name;
            allInfo[1] = schoolClass.count.toString();
            allInfo[2] = schoolClass.fixedClassRoom;
            writer.writeNext(allInfo);
            for (int i = 0; i < 6; i++){
                writer.writeNext(schoolClass.schedule.getScheduleOfDay(i));
                System.out.println(schoolClass.schedule.getScheduleOfDay(i)[0]
                +schoolClass.schedule.getScheduleOfDay(i)[1] + schoolClass.schedule.getScheduleOfDay(i)[2]);
            }
        }
    }
}
