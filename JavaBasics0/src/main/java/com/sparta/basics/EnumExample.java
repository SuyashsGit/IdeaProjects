package com.sparta.basics;


public class EnumExample {

    public static void main(String[] args) {
        DayIndex dayOfWeek;
        dayOfWeek = DayIndex.SUNDAY;
        if(dayOfWeek.equals(DayIndex.SATURDAY) || dayOfWeek == DayIndex.SUNDAY) //== and .equals() in enums --> they both works exactly the same
            System.out.println("It is the weekend!");
        else
            System.out.println("It's a weekday");
        System.out.println(dayOfWeek);
    }
}
