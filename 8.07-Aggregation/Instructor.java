public class Instructor {
	private String firstName;
	private String lastName;
	private String officeNumber;

	public Instructor(String firstName, String lastName, String officeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNumber = officeNumber;
	}

	public Instructor(Instructor object2) {
		this.firstName = object2.fistName;
		this.lastName = object2.lastName;
		this.officeNumber = object2.officeNumber;
	}

	public void set(String firstName, String lastName, String officeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeNumber = officeNumber;
	}

	public String toString() {
		String str = "First Name:" + firstName + "\nLast Name: " + lastName + "\nOffice Number: " + officeNumber;
		return str;
	}
}

