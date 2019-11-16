package com.gojek.parking_lot.model;

/**
 * @author bharat.khurana
 */
public abstract class Vehicle {
    private String registrationNo = null;
    private String color = null;

    public Vehicle(String registrationNo, String color) {
        this.registrationNo = registrationNo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[registrationNo=" + registrationNo + ", color=" + color + "]";
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
