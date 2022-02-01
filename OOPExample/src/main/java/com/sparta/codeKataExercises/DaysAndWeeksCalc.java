package com.sparta.codeKataExercises;

public class DaysAndWeeksCalc {
    public static void main(String[] args) {
        int days = 7;
        int days2 = days;
        DaysAndWeeksCalc dwc = new DaysAndWeeksCalc();
        System.out.println("Weeks left: " + dwc.weekCalc(days) + ", and days remaining: " + dwc.daysCalc(days2));
    }
    public int weekCalc(int days){
        int weeks = (int) days/7;
        return weeks;
    }
    public int daysCalc(int days2){
        int daysLeft = days2 % 7;
        return daysLeft;
    }
}
