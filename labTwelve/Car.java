package labTwelve;

public class Car {

	protected String carMake;
	protected String carModel;
	protected int carYear;
	protected double carPrice;
	
	public Car() {
		
	}
	
	public Car(String carMake, String carModel, int carYear, double carPrice) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carPrice = carPrice;
		
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	@Override 
	public String toString() {
		return "Car:   " + carMake + "   " + carModel + "   " + carYear + "   $" + carPrice;
	}
	
	public static boolean getValidated(int userInput) {
		if (userInput >= 1 && userInput <= 6) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
	
	
	
}
