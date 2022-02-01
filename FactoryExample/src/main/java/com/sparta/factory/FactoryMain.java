package com.sparta.factory;

import com.sparta.factory.controller.VehicleController;
import com.sparta.factory.model.*;
import com.sparta.factory.view.VehicleView;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        VehicleView view =  new VehicleView();
        String desiredVehicleType = view.getDesiredVehicle();

        VehicleController controller = new VehicleController();
        controller.initiateDriving(desiredVehicleType);

        String result = controller.initiateDriving(desiredVehicleType);
        view.displayResults(result);

//        Vehicle v = getVehicle(desiredVehicleType);
//        v.drive();
    }


    //simple factory method
//    public static Vehicle getVehicle(String vehicleType){
//        VehicleFactory vf;
//        if(vehicleType.equals("car"))
//            vf = new CarFactory();
//        else if (vehicleType.equals("helicopter"))
//            vf = new HelicopterFactory();
//        else
//            vf = new MotorbikeFactory();
//        return vf.getInstance();
//    }

}
