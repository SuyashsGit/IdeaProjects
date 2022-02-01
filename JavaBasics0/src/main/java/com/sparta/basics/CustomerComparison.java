package com.sparta.basics;

public class CustomerComparison {
    public static void main(String[] args)
    {
        Customer c1 = new Customer("Roberto", "Lovece"); //creating the object c1
        c1.setEmail("roberto1@gmail.com");

        Customer c2 = new Customer("Roberto", "Lovece");
        c2.setEmail("roberto@gmail.com");
        //if(c1 == c2) //comparing object references
        if (c1.equals(c2))
            System.out.println("These are the same customers");

        Customer c3 = new Customer();
        System.out.println(c3.getFirstName());
    }
}
