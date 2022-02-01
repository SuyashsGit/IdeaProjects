package com.sparta.basics;
// HW W2-Day1
public class DuplicateStr {
    public static void main(String[] args) {
        String sentence = "Nishant Mandal"; //we can convert this to lower and then check, to avoid getting, eg: H and h as different characters
        System.out.println("Input string is: " + sentence);

        String characters = ""; //stores every character we come across
        String duplicates = ""; //stores every duplicate character we come across
        for(int i =0; i < sentence.length(); i++) //checking the characters from i=0 till the length of the string
        {
            String current = Character.toString(sentence.charAt(i)); //converting each character we test to a string and storing in the current variable
            if(characters.contains(current))
            {
                if(! duplicates.contains(current)) //Checking if duplicate characters are not within duplicate characters
                {
                    duplicates += current + ",";
                }
            }
            characters += current;
        }
        System.out.println(duplicates);
    }
}
