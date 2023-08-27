package com.example.GasPrice;
import java.time.LocalDateTime;
public class FuelResponse {
    private double noOfGallonsField;
    private double pricePerGallon;
    private LocalDateTime transactionDate;
    private double totalPrice;

    public FuelResponse(double noOfGallonsField, double pricePerGallon, LocalDateTime transactionDate, double totalPrice) {
        this.noOfGallonsField = noOfGallonsField;
        this.pricePerGallon = pricePerGallon;
        this.transactionDate = transactionDate;
        this.totalPrice = totalPrice;
    }

    public double getNoOfGallonsField() {
        return noOfGallonsField;
    }

    public void setNoOfGallonsField(double noOfGallonsField) {
        this.noOfGallonsField = noOfGallonsField;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
// Getters and setters
}
