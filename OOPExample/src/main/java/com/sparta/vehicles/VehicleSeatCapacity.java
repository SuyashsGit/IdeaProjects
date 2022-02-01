package com.sparta.vehicles;

public abstract class VehicleSeatCapacity
{

    public abstract int noOfSeats();

    @Override
    public String toString() {
        return "Seat capacity for this vehicle is: " + noOfSeats();
    }
}
