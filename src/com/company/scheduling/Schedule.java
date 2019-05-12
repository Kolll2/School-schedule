package com.company.scheduling;

import java.util.Arrays;

public class Schedule {
    //time of the lesson
    public static final int TOTL = 9; // 9 periods per day (Excluding Snack)
    //educational day
    public static final int ED = 6; // Approximately 5 school days per week

    public String[][] schedule = new String[ED][TOTL];

    public String[] getScheduleOfDay (int ED){
        String [] result = new String [TOTL];
        for (int i = 0; i < 9; i++){
            result[i] = this.schedule[ED][i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "Schedule{" + schedule[0] + " " +schedule[1] + " " + schedule[2]
                + " " + schedule[3] + " " +schedule[4] + " " + schedule[5]+
                '}';
    }
}
