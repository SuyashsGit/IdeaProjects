package com.sparta.basics;

import java.util.Objects;

public class Customer {
    private String firstName; //default value of null, because this are an instance variable within a class
    private String lastName; //default value of null, because this are an instance variable within a class
    private int age;
    // for primitive type, the default value is 0 (integer type), 0.0 (floating point), false (boolean), '\0' (char) represents null character

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email; //default value of null, because this are an instance variable within a class

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    @Override //overriding the equals method inherited from the object
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o; //typecase cast from object to customer
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email);
    }

    @Override
    // for 2 objects which are equal (according to .equal()) the hashcode values should be the same.
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
