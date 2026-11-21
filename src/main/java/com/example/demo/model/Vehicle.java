package com.example.demo.model;

public abstract class Vehicle {
	 	
//abstract class Vehicle	Abstraction
//	private fields	Encapsulation
//	Constructor	Initializes vehicle details
//	Getters	Controlled access to fields
//	VehicleType	Enum usage
	
		private String vehicleNumber;
	    private VehicleType vehicleType;

	    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
	        this.vehicleNumber = vehicleNumber;
	        this.vehicleType = vehicleType;
	    }

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public VehicleType getVehicleType() {
	        return vehicleType;
	    }
}
