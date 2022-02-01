package com.sparta.vehicles;


public class Car extends Vehicle
{


    static void toCombine( String model, String make, double engineSize, String colour, String style, int fuelLevel, boolean roadTaxStatus)
    {
        System.out.println("Car details -->" + " Model: " + model + ", Make: " + make + ", Engine size: " + engineSize + ", Colour: " + colour
                + " Style: " + style + ", Fuel level: " + fuelLevel + ", Road tax paid? " + roadTaxStatus);
    }

    public double differenceBetweenEngineSizeAndFuelLevel(double fuelLevel, double engineSize)
    {
        return (fuelLevel - engineSize);
    }

//    public boolean isRoadTaxStatus()
//    {
//        return isRoadTaxStatus();
    //}

}
