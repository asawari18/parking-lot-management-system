
package com.example.demo.service;

public class ParkingFeeCalculator {

//	Code	Concept
//	private	Encapsulation
//	final	Value cannot be reassigned after initialization
//	Constructor	Dependency/configuration injection
//	IllegalArgumentException	Input validation
//	
    private final double hourlyRate;

    public ParkingFeeCalculator(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateFee(int hours) {

        if (hours <= 0) {
            throw new IllegalArgumentException(
                "Parking hours must be greater than zero"
            );
        }

        return hours * hourlyRate;
    }
}
