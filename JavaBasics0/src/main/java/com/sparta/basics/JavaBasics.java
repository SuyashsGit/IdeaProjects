package com.sparta.basics;

public class JavaBasics {
    public static void main(String[] args) { // putting more code in the main method makes it more difficult to debug the code or test
        int myIndex = 0;
        // float, boolean, byte, char, short, long, double <-- primitive types (8 of those are in java), primitive types are all keywords (in orange)
        //String <-- not primitive, capitalised therefore class
        boolean isOpen =true; //always accepts only true and false
        String name = "Conor"; //identifiers (things we add) are shown in white colour, variables are in grey until we use it, if used it will be go to white colour
        String anotherName = "Conor"; // refers to the same String (stored in the same string pool), works because STRINGS ARE IMMUTABLE  (cannot be changed)
        anotherName = name.toUpperCase(); //creates a new string which is in upper case, since strings cannot be changed/modified in java
        System.out.println("The trainee name is: " + name); // operators only works on primitive types-concatenation here
        System.out.println("In upper case: " + anotherName);
        String testName = new String("Conor"); //creates a new string (object) in the heap
        // testName == name;

        if(name.equals(testName)) // this will work. -->comparison of the two strings here will return true.
            System.out.println("This is Conor");
    }
}
