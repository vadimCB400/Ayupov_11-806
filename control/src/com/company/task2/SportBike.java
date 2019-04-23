package com.company.task2;

public class SportBike {
    private int speed;
    private String model;
    private boolean powerful;

    public SportBike(int speed, String model, boolean powerful) {
        this.speed = speed;
        this.model = model;
        this.powerful = powerful;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public boolean isPowerful() {
        return powerful;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPowerful(boolean powerful) {
        this.powerful = powerful;
    }

    @Override
    public String toString() {
        return "SportBike(" + "speed= " + speed + " model= " + model + " powerful=" + powerful + '\'' + ")";
    }
}
