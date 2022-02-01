package com.sparta.codeKataExercises;

public class EnumExercise {
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {

        for(Days days : Days.values()){
            System.out.println(days);
        }
        Days d2 = Days.MONDAY;

        switch(d2) {
            case SUNDAY, SATURDAY:
                System.out.println("This is a weekend");
                break;
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("This is a weekday");
                break;
        }
    }
}
