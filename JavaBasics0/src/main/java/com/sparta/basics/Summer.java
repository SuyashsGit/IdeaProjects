package com.sparta.basics;

public class Summer {
    public static void main(String[] args)
    {
        int[] myInts = {1, 2, 3, 4, 5}; //[] means it is an array
        Summer summer = new Summer(); //making a variable of type Summer
        System.out.println(summer.sumArray(myInts));

    }
    public int sumArray(int[] theInts) //return type will be an int as specified here, Different name is just a label for our purposes, it only checks the type we want to take action on.
    {
//        int sum = 0;
//        int i = 0;
//        for(i = 0; i< theInts.length; i++)
//            sum = sum + theInts[i];
//        return sum;



        int lengthOfArray = theInts.length;
        int result = 0;
        for(int i = 0; i < lengthOfArray; i++){     //for(int nextValve: theInts) -->for each loop
            result += theInts[i];                   //result += nextValue;
                                                    // if one line of code is after the for loop { are optional, in java indentation does not matter.
        }
        return result;
    }
}
