package com.company.dblayer;

import com.company.generator.GenerateTeacher;
import com.company.person.Teacher;
import com.company.scheduling.Load;
import com.company.schoolclass.SchoolClass;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;

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

    public static void readTeacherFromCSV () throws IOException, ParseException {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String csvFilename = "C:\\school schedule\\Teacher.csv";
        FileReader reader = new FileReader(csvFilename);
        CSVReader csvReader = new CSVReader(reader, ';');
        String[] row = null;
        System.out.println("====>READ TEACHER FROM VSV<====");
        while((row = csvReader.readNext()) != null) {
            System.out.println("name => " + row[0]
                    + " BD==> " + row[1]);
            String[] temp = row[3].split("#");
            Date date =  simpleDateFormat.parse(row[1]);
            Teacher result = new Teacher(row[0],date);
            int i = 0;
            Load[] resultLoad = new Load[temp.length];
            for (String str : temp){
                String[] tempResult = str.split("=");
                resultLoad[i] = new Load(tempResult[0], Integer.parseInt(tempResult[1]));
            }
        }
        reader.close();
        csvReader.close();
        System.out.println("=================================");


    }
}
