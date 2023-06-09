package com.rgt.training.session3;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static RentalService rentalservice = new RentalService();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		Customer customer;
		Rental rental1 = null;

		do {
			System.out.println("Welcome to Vehicle rental system - Menu");
			System.out.println("1.Add Vehicle");
			System.out.println("2.List Available vehicles");
			System.out.println("3.Rent a Vehicle");
			System.out.println("4.Calculate rental cost");
			System.out.println("5.Return vehicle");
			System.out.println("6.Quit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			// Rental rental1;
			switch (choice) {

			case 1:
				Vehicle vehicles;
				System.out.println("Enter Vehicle type: ");
				String v_Type = sc.next();
				System.out.println("Enter vehicle licensePlate: ");
				String license = sc.next();
				System.out.println("Enter vehicle made by: ");
				String make = sc.next();
				System.out.println("Enter vehicle model: ");
				String model = sc.next();
				System.out.println("Enter vehcile ID: ");
				String vehicleID = sc.next();
				System.out.println("");

				if (v_Type.equalsIgnoreCase("car")) {
					vehicles = new Car(license, make, model, vehicleID);
				} else if (v_Type.equalsIgnoreCase("motorcycle")) {
					vehicles = new MotorCycle(license, make, model, vehicleID);
				} else if (v_Type.equalsIgnoreCase("bicycle")) {
					vehicles = new Bicycle(license, make, model, vehicleID);
				} else {
					System.out.println("Invalid vehicle type. Please try again--------");
					break;
				}
				rentalservice.addVehicle(vehicles);
				System.out.println("Vehicle added successfully--------");
				break;

			case 2:
				List<Vehicle> availableVehicles = rentalservice.getAvailableVehicles();
				System.out.println("Available vehicles list is :");
				for (Vehicle vehicle : availableVehicles) {
					System.out
							.println(vehicle.getLicensePlate() + " - " + vehicle.getMake() + " " + vehicle.getModel());
				}
				break;

			case 3:
				System.out.println("Enter Vehicle Made by: " );
				v_Type = sc.next();
				if (selectVehicle(v_Type) != null) {
					Vehicle vehicle_make = (Vehicle) selectVehicle(v_Type);
					System.out.println("Create a customer to Rent a car");
					System.out.print("\nEnter customer first name: ");
					String firstName = sc.next();
					System.out.print("Enter customer last name: ");
					String lastName = sc.next();
					System.out.print("Enter customer ID: ");
					String customerID = sc.next();
					System.out.println("Enter customer email: ");
					String email = sc.next();
					System.out.println("Enter customer phone number: ");
					String phNumber = sc.next();
					customer = new Customer(firstName, customerID, email, lastName, phNumber);

					LocalDateTime startTime = LocalDateTime.now();
					System.out.print("How many hours do you want a vehicle for rent: ");
					int rentHours = sc.nextInt();
					LocalDateTime endTime = startTime.plusHours(rentHours);
					 rental1 = rentalservice.rentVehicle(customer, vehicle_make, startTime, endTime);
					if (rental1 != null) {
						System.out.println("Rental successful:");
						System.out.println("Vehicle: " + rental1.getRentedVehicle().getLicensePlate());
						System.out.println("Customer: " + rental1.getCustomer().getFirstName() + " "
								+ rental1.getCustomer().getLastName());
						System.out.println("Start Time: " + rental1.getStartTime());
						System.out.println("End Time: " + rental1.getEndTime());
					}
				} else {
					System.out.println("Vehicle is not available for rent.");
				}

				break;

			case 4:
				System.out.println("Rental cost for vehicle is : ");
				BigDecimal rentalCost = rentalservice.calculateRentalCost(rental1);
				System.out.println("Rental Cost: $" + rentalCost);
				break;

			case 5:
				System.out.println("Enter Vehicle name to return");
				String vehicle_Name = sc.next();
				boolean returned = rentalservice.returnVehicle(rental1);
				if (returned) {
					System.out.println("Vehicle returned successfully.");
				} else {
					System.out.println("Failed to return the vehicle.");
				}
				break;

			case 6:
				System.out.println("Thank you ---");
				break;

			default:
				System.out.println("Enter valid choice-----");
			}
			System.out.println();
		} while (choice != 6);
		sc.close();
	}

	public static Vehicle selectVehicle(String vehicleName) {
		List<Vehicle> availableVehicles1 = rentalservice.getAvailableVehicles();
		for (Vehicle vehicle : availableVehicles1) {
			if (vehicle.getMake().equalsIgnoreCase(vehicleName)) {
				return vehicle;
			}
		}
		return null;
	}

}
