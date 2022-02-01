package com.sparta.factory.controller;

import com.sparta.factory.model.*;

public class VehicleController {
    public String initiateDriving(String desiredVehicleType) {

        Vehicle v = getVehicle(desiredVehicleType);
        return v.drive();
    }

    public static Vehicle getVehicle(String vehicleType){
        VehicleFactory vf;
        if(vehicleType.equals("car"))
            vf = new CarFactory();
        else if (vehicleType.equals("helicopter"))
            vf = new HelicopterFactory();
        else
            vf = new MotorbikeFactory();
        return vf.getInstance();
    }
}
