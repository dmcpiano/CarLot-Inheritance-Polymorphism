package labTwelve;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		int carChoice = 0;
		String userBuy = null;
		String userContinue = null;
		
		ArrayList<Car> myCars = new ArrayList<>();
		myCars.add(new UsedCar("Ford", "Focus", 2000, 6000.00, 79324.5));
		myCars.add(new UsedCar("Chevrolet", "Malibu", 2015, 18000.00, 32487.2));
		myCars.add(new UsedCar("Range", "Rover", 2003, 3200.00, 173253.6));
		myCars.add(new Car("Honda", "Oddysey", 2020, 58795.00));
		myCars.add(new Car("Toyota", "RAV4", 2020, 42750.00));
		myCars.add(new Car("Honda", "Accord", 2020, 27335.00));
		
		System.out.println("Welcome to DC Motors!\n");
		System.out.printf("%-2s %-10s %-10s %-10s %-11s %-10s\n", "  ", "Make", "Model", "Year", "Price", "Mileage");	
			
		for (int i = 0; i < myCars.size(); ++i) {
			if (myCars.get(i) instanceof UsedCar) {
				UsedCar tempUsedCar = (UsedCar) myCars.get(i);
				
				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f %-10.1f\n", (i + 1), 
						  myCars.get(i).getCarMake(), 
						  myCars.get(i).getCarModel(), 
						  myCars.get(i).getCarYear(),
						  myCars.get(i).getCarPrice(),
						  tempUsedCar.getCarMileage());
				
			} else {
				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f\n", (i + 1), 
						myCars.get(i).getCarMake(), 
						myCars.get(i).getCarModel(), 
						myCars.get(i).getCarYear(),
						myCars.get(i).getCarPrice());
			}																	  
		}
		
		do {
			do {
				System.out.print("\nWhich would you like? (1, 2, 3, 4, 5, 6): ");
				carChoice = scnr.nextInt();
				scnr.nextLine();
					if (Car.getValidated(carChoice) == false) {
						System.out.println("Invalid input. Please try again.");
					} else {
						System.out.println(myCars.get(carChoice - 1).toString());
					}
				} while (Car.getValidated(carChoice) == false);
		
		System.out.print("\nBuy this car? (y/n)");
			userBuy = scnr.nextLine();
			if (userBuy.substring(0, 1).equalsIgnoreCase("y")) {
				System.out.println("\nWonderful choice, our finance department will be in touch shortly.");
				myCars.remove(carChoice - 1);
			} else {
				break;
			}
		
		System.out.printf("\n%-2s %-10s %-10s %-10s %-10s %-10s\n", "  ", "Make", "Model", "Year", "Price", "Mileage");
		for (int i = 0; i < myCars.size(); ++i) {
			if (myCars.get(i) instanceof UsedCar) {
				UsedCar tempUsedCar = (UsedCar) myCars.get(i);
				
				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f %-10.1f\n", (i + 1), 
						  myCars.get(i).getCarMake(), 
						  myCars.get(i).getCarModel(), 
						  myCars.get(i).getCarYear(),
						  myCars.get(i).getCarPrice(),
						  tempUsedCar.getCarMileage());
				
			} else {
			System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f\n", (i + 1), 
					myCars.get(i).getCarMake(), 
					myCars.get(i).getCarModel(), 
					myCars.get(i).getCarYear(),
					myCars.get(i).getCarPrice());
			}																	  
		}
		
		System.out.println("\nChoose another? (y/n)");
		userContinue = scnr.nextLine();
		
		
		} while (userContinue.substring(0, 1).equalsIgnoreCase("y"));
		

		System.out.println("Zoom you later!");
		

	}
}
