package com.sparta.oop;

public class Customer extends Person implements Comparable<Customer>
{
    private int customerId; //default 0
    private String deliveryAddress;

    // methods should generally be public, but protected or private are fine

// can create as many constructors we like but avoid DRY

    public Customer(String firstName, String lastName, int customerId)
    {
        super(firstName, lastName);
        this.customerId = customerId;
    }

    public Customer(String lastName, int customerId)
    {
        this("no-name", lastName, customerId); //calling the constructor above
    }

    public Customer()
    {
        this("no-name", "no-name", -1);
    }

    @Override
    public final void delete() {
        System.out.println("This customer has closed their account");
    }

    public String toString()
    {
        return "Customer #" + this.customerId + " : " + getFirstName() + " " + getLastName();
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        if(deliveryAddress == null)
            throw new IllegalArgumentException("deliveryAddress cant be null");
        this.deliveryAddress = deliveryAddress;
    }

    public int compareTo(Customer other){
        return getLastName().compareTo(other.getLastName());
    }
}
