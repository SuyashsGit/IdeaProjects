package com.sparta.oop;

public class RetailStore {
    public static void main(String[] args) {
        Customer jyoti = new Customer("Jyoti","Suresh",1234);

        System.out.println(jyoti);

        Customer sami = new Customer();
        sami.setFirstName("Sami");


//        try {
//            sami.setDeliveryAddress(null);
//        } catch(IllegalArgumentException e) {
//            System.err.println(e);
//        }


        System.out.println(sami);
        System.out.println(sami.getDeliveryAddress());


        Employee e = new Employee("Brandon", "Johnson");
        e.setDepartmentName("Java Engineering");
        e.setSalary(100000.00);

        e.delete();

        System.out.println(e);

//        Person anthony = new Person();
//        anthony.setFirstName("Anthony");
//        anthony.setLastName("No idea");
//
//        System.out.println(anthony);

        Person thePerson = new Customer(); //BECAUSE A CUSTOMER IS-A PERSON therefore this will work! (inheritence relationship)

        System.out.println(thePerson.getLastName());

        thePerson.delete();



        System.out.println(thePerson); //polymorphism in action
    }
}
