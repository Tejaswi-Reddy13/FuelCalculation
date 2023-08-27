package com.example.GasPrice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class FuelController {

    @PostMapping("/calculateFuel")
    public ResponseEntity<FuelResponse> calculateFuel(@RequestBody FuelRequest request) {
        double maxGallonCapacity = request.getMaxGallonCapacity();
        double ensuringNoOfGallonsInVehicle = request.getEnsuringNoOfGallonsInVehicle();

        // Calculate the response values
        double noOfGallonsField = maxGallonCapacity - ensuringNoOfGallonsInVehicle;
        double pricePerGallon = 2.00;

        double totalPrice = noOfGallonsField * pricePerGallon;
        LocalDateTime transactionDate = LocalDateTime.now();

        FuelResponse response = new FuelResponse(noOfGallonsField, pricePerGallon, transactionDate, totalPrice);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
