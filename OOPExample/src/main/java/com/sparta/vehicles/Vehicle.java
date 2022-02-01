package com.sparta.vehicles;

public class Vehicle{
    private String model;
    private String make;
    private double engineSize;
    private String colour;
    private String style;
    private int fuelLevel;
    private boolean roadTaxStatus;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setRoadTaxStatus(boolean roadTaxStatus) {
        this.roadTaxStatus = roadTaxStatus;
    }

    public boolean isRoadTaxStatus() {
        return roadTaxStatus;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", engineSize=" + engineSize +
                ", colour='" + colour + '\'' +
                ", style='" + style + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", roadTaxStatus=" + roadTaxStatus +
                "} ";
    }


}
