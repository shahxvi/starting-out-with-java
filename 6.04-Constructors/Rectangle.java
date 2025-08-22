public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double len, double w) {
		length = len;
		width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length * width;
	}
}

