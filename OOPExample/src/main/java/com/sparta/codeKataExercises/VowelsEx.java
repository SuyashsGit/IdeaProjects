package com.sparta.codeKataExercises;

public class VowelsEx {
    public static void main(String[] args) {
         String sr = "Suyash";
        System.out.println("Vowel(s) in this string are/is: " + vowelCounter(sr));
    }

    public static int vowelCounter(String sr){
       int count = 0;
        for(int i = 0; i< sr.length(); i++)
            if (sr.charAt(i) == 'a' || sr.charAt(i) == 'e'|| sr.charAt(i) == 'i'|| sr.charAt(i) == 'o'|| sr.charAt(i) == 'u'){
                count += 1;
            }
        return count;
    }

}
