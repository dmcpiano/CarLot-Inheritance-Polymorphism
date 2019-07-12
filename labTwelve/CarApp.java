package labTwelve;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class CarApp {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		
		String userMake = null;
		String userModel = null;
		int userYear = 0;
		double userPrice = 0.00;
		int userNumCars = 0;
		
		System.out.println("Welcome to DC Motors!\n");
		
		do {
			System.out.println("How many cars? ");
			userNumCars = scnr.nextInt();
			scnr.nextLine();
			if (Car.getValidated(userNumCars) == false) {
				System.out.println("Limit is 6, try again.");
			} 
		} while (Car.getValidated(userNumCars) == false);
		
		
		String[] carMakes = new String[userNumCars];
		String[] carModels = new String[userNumCars];
		int[] carYears = new int[userNumCars];
		double[] carPrices = new double[userNumCars];
		
		
		for (int i = 0; i < userNumCars; ++i) {
			System.out.print("\nEnter Car #" + (i + 1) + " Make: ");
			userMake = scnr.nextLine();
			carMakes[i] = userMake;
			
			System.out.print("\nEnter Car #" + (i + 1) + " Model: ");
			userModel = scnr.nextLine();
			carModels[i] = userModel;
			
			System.out.print("\nEnter Car #" + (i + 1) + " Year: ");
			userYear = scnr.nextInt();
			carYears[i] = userYear;
			
			System.out.print("\nEnter Car #" + (i + 1) + " Price: $");
			userPrice = scnr.nextInt();
			scnr.nextLine();
			carPrices[i] = userPrice;
		
		}
		
		
		System.out.println("\nInventory: ");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Make", "Model", "Year", "Price");
		
		for (int i = 0; i < userNumCars; ++i) {
			System.out.printf("%-10s %-10s %-10d $%-10.2f\n", carMakes[i], carModels[i], carYears[i], carPrices[i]);
		}
		
	}
}
