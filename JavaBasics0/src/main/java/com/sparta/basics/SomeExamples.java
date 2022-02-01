package com.sparta.basics;

public class SomeExamples {
    public static void main(String[] args) {
        int a = 5;
        int b = 19;
        System.out.println(b/a); //it will use/return integer arithmatic. Result is truncated (rounded down) //if one is float/double (mismatch type) other one will be automatically converted to float and result will be a float
        if(!(b > 12) || a < 8) //short circuit way
            System.out.println("b is Big!");
        Customer o = new Customer();
        System.out.println(o);

        if(o == null)
            System.out.println("o is null");
    }
}
