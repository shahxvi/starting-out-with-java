public class SportsCarDemo22 {
	public static void main(String[] args) {
		SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, CarColor.RED, 100000);

		System.out.println(yourNewCar);

		switch (yourNewCar.getMake()) {
			case PORSCHE:
				System.out.println("Your car was made in Germany.");
				break;
			case FERRARI:
				System.out.println("Your car was made in Italy.");
				break;
			case JAGUAR: 
				System.out.println("Your car was made in England.");
				break;
			default:
				System.out.println("I'm not sure where that car was made.");
		}
	}
}
