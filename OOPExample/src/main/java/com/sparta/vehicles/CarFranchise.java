package com.sparta.vehicles;

import com.sparta.oop.Customer;
import com.sparta.oop.Employee;
import com.sparta.oop.Person;
import com.sparta.shapes.Circle;
import com.sparta.shapes.Shape;
import com.sparta.shapes.Square;

import java.util.Random;

public class CarFranchise
{
    public static void main(String[] args)
    {
        Car car1 = new Car();


        car1.toCombine("Focus", "Ford", 1.5, "Red", "SUV", 50, true);
        System.out.println(car1.differenceBetweenEngineSizeAndFuelLevel(50,1.5));


        Car car2 = new Car();


        car2.toCombine("Benz", "Mercedes", 1.9, "White", "Small car", 40, false);
        System.out.println(car2.differenceBetweenEngineSizeAndFuelLevel(40,1.9));


        Vehicle v = new Car();
        v.setColour("Blue");
        v.setRoadTaxStatus(true);


        System.out.println(v);

        Vehicle v2 = new Bus();
        v2.setRoadTaxStatus(false);
        v2.setColour("Black");


        System.out.println(v2);


//        VehicleSeatCapacity[] noOfSeats = new VehicleSeatCapacity[5];
//        Random s = new Random();
//
//        for(int i = 0; i<5; i++)
//        {
//            if(s.nextDouble(1) < 0.5)
//                VehicleSeatCapacity[i] = new Car(s.nextDouble());
//            else
//                VehicleSeatCapacity[i] = new Bus(s.nextDouble());
//
//        }
//        for(VehicleSeatCapacity vs: noOfSeats)
//            System.out.println(vs + " This is a " + vs.getClass());
//
    }

}



/**
 * JavaDoc comment
 *
 */