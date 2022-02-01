package com.sparta.oop;

public abstract class Person {

    // all variables should be private, never public **possibly** protected
    //default or package access- avoid using this
    protected String firstName= "dummy"; //default null unless assigned like this
    protected String lastName; //default null

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

    }

    public abstract void delete(); //no implementation of the abstract methods


    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
