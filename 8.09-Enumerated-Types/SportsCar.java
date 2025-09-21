public class SportsCar {
	private CarType make;
	private CarColor color;
	private double price;

	public SportsCar(CarType make, CarColor color, double price) {
		this.make = make;
		this.color = color;
		this.price = price;
	}

	public CarType getMake() {
		return make;
	}

	public CarColor getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		String str = String.format("Make: %s\nColor: %s\nPrice: RM%,.2f", make, color, price);
		return str;
	}
}

