package com.sparta.oop;

import java.util.ArrayList;
import java.util.Collections;

public class InterfaceExample {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Steven");
        strList.add("Andrew");
        strList.add("Mehmet");
        strList.add("Autumn");

        Collections.sort(strList); //sorts the list for us --> static methods are displayed in italic
        System.out.println(strList);


        ArrayList<Customer> custList = new ArrayList<>();

        custList.add(new Customer("Aiden","Skyes", 4));
        custList.add(new Customer("Jack","Gilbride", 44));
        custList.add(new Customer("Dayle","Bernado", 28));
        custList.add(new Customer("Piotr","Sulek", 81));
        custList.add(new Customer("Natasha","Reilly", 17));

        Collections.sort(custList);
        System.out.println(custList);
    }
}
