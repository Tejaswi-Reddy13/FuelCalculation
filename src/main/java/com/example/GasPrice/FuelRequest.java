package com.example.GasPrice;
import java.time.LocalDateTime;
public class FuelRequest {
    private double maxGallonCapacity;
    private double ensuringNoOfGallonsInVehicle;

    public double getMaxGallonCapacity() {
        return maxGallonCapacity;
    }

    public void setMaxGallonCapacity(double maxGallonCapacity) {
        this.maxGallonCapacity = maxGallonCapacity;
    }

    public double getEnsuringNoOfGallonsInVehicle() {
        return ensuringNoOfGallonsInVehicle;
    }

    public void setEnsuringNoOfGallonsInVehicle(double ensuringNoOfGallonsInVehicle) {
        this.ensuringNoOfGallonsInVehicle = ensuringNoOfGallonsInVehicle;
    }
}