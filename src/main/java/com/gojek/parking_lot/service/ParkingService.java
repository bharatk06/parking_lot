package com.gojek.parking_lot.service;

import com.gojek.parking_lot.model.Vehicle;

import java.util.Optional;

/**
 * @author bharat.khurana
 *
 */
public interface ParkingService {

    public void buildParkingLot(int level, int capacity);

    public Optional<Integer> getAvailableSlotsCount(int level);

    public void getRegNumberForColor(int level, String color);

    public void getSlotNumbersFromColor(int level, String colour);

    public int getSlotNoFromRegistrationNo(int level, String registrationNo);

    public Optional<Integer> park(int level, Vehicle vehicle);

    public void unPark(int level, int slotNumber);

    public void getStatus(int level);

    public void resetParkingLot();
}
