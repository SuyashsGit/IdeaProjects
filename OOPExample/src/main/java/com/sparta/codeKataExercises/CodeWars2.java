package com.sparta.codeKataExercises;

public class CodeWars2 {
    public static void main(String[] args) {
        CodeWars2 cw2 = new CodeWars2();
        System.out.println();


    }
    public String spinWords(String sentence)
    {
        //String s = "This is a sample sentence.";
        String[] words = sentence.split("\\s+");
        System.out.println(words);
        for (int i = 0; i < words.length; i++)
        {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }


        return sentence;
    }
}
