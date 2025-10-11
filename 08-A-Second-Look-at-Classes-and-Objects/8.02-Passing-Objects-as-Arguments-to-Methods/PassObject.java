public class PassObject {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(12.0, 5.0);

		displayRectangle(box);
	}

	/**
	   The displayRectangle method displays the length and width of a rectangle
	   @param r A reference to a Rectangle object
	*/

	public static void displayRectangle(Rectangle r) {
		System.out.println("Length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
	}
}

