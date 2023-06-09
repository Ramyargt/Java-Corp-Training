package com.rgt.training.session3;

public abstract class Vehicle implements VehicleOperations {

	private String licensePlate;
	private String make;
	private String model;
	private String vehicleID;
	private int rentalPricePerDay;

	private boolean isAvailable;

	public Vehicle(String licensePlate, String make, String model, String vehicleID) {
		super();
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.vehicleID = vehicleID;
		this.isAvailable = true;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public int getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	@Override
	public boolean isAvailable() {
		return isAvailable;
	}

	@Override
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;

	}

}
