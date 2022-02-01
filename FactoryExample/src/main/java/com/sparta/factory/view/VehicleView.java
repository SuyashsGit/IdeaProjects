package com.sparta.factory.view;

import java.util.Scanner;

public class VehicleView {
    public String getDesiredVehicle(){
        System.out.println("Please enter your desired vehicle type: ");
        Scanner scanner = new Scanner(System.in);
        String desiredVehicleType = (scanner.next()).toLowerCase(); //READS THE INPUT TILL THE SPACE
        return desiredVehicleType;
    }

    public void displayResults(String result) {
        System.out.println(result);
    }
}
