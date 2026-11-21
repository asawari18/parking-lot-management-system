package com.example.demo;


import com.example.demo.service.ParkingFeeCalculator;

public class ParkingFeeCalculatorTest {

    public static void main(String[] args) {

        ParkingFeeCalculator calculator =
                new ParkingFeeCalculator(20);

        System.out.println(calculator.calculateFee(2));
        System.out.println(calculator.calculateFee(5));
    }
}
