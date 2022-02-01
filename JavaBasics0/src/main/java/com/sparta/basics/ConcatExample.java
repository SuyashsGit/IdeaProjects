package com.sparta.basics;

import org.w3c.dom.ls.LSOutput;

public class ConcatExample {
    public static void main(String[] args) {
        String[] names = {"Aiden", "Alvaro", "Andrew", "Antony", "Autumn",
                "Ben", "Brandon", "Conor", "Dale"};

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < names.length ; i++)
        {
            names[i] = i + ":" + names[i];
            //result.append(":");
            result.append(names[i]);
            result.append(", ");

        }
        System.out.println(result.toString()); //calls toString() on the result object by default if we only write result in the brackets
        for(String name : names){
            System.out.println(name);
        }

    }
}
