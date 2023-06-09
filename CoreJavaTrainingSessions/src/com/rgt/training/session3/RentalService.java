package com.rgt.training.session3;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RentalService implements RentalCostCalculator {

	private List<Vehicle> vehicles;
	private List<Rental> rentals;
	double rentalPrice = 10;

	public RentalService() {
		super();
		this.vehicles = new ArrayList<>();
		this.rentals = new ArrayList<>();
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	// Display available vehicles
	public List<Vehicle> getAvailableVehicles() {
		List<Vehicle> availableVehicles = new ArrayList<>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.isAvailable()) {
				availableVehicles.add(vehicle);
			}
		}
		return availableVehicles;
	}

	// Rent a vehicle
	public Rental rentVehicle(Customer customer, Vehicle vehicle, LocalDateTime startTime, LocalDateTime endTime) {
		if (!vehicle.isAvailable()) {
			return null;
		}
		Rental rental = new Rental(vehicle, customer, startTime, endTime);
		vehicle.setAvailable(false);
		rentals.add(rental);
		return rental;
	}

	// Calculate rental cost (polymorphism)
	@Override
	public BigDecimal calculateRentalCost(Rental rental) {
		LocalDateTime startTime = rental.getStartTime();
		LocalDateTime endTime = rental.getEndTime();
		Duration duration = Duration.between(startTime, endTime);
		long durationInHours = duration.toHours();
		BigDecimal hourlyRate = new BigDecimal(rentalPrice);
		return hourlyRate.multiply(BigDecimal.valueOf(durationInHours));
	}

	// Return a rented vehicle
	public boolean returnVehicle(Rental rental) {
		if (!rentals.contains(rental)) {
			return false;
		}
		rental.getRentedVehicle().setAvailable(true);
		rentals.remove(rental);
		return true;
	}

}
