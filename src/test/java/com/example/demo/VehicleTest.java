package com.example.demo;
import com.example.demo.model.*;

public class VehicleTest {

    public static void main(String[] args) {

        Vehicle car = new Car("MH12AB1234");
        Vehicle bike = new Bike("MH12XY5678");
        Vehicle truck = new Truck("MH14CD9876");

        System.out.println(car.getVehicleNumber());
        System.out.println(car.getVehicleType());

        System.out.println(bike.getVehicleNumber());
        System.out.println(bike.getVehicleType());

        System.out.println(truck.getVehicleNumber());
        System.out.println(truck.getVehicleType());
    }
}
