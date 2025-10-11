public class Course {
	private String courseName;
	private Instructor instructor;
	private TextBook textBook;

	public Course(String courseName, Instructor instructor, TextBook textBook) {
		this.courseName = courseName;

		// Create a new Instructor object
		// Passing @param instructor as an argument to copy
		this.instructor = new Instructor(instructor);


		// Create a new TextBook object
		// Passing @param textBook as an argument
		this.textBook = new TextBook(textBook);
	}

	public String getName() {
		return courseName;
	}

	// @return A reference to a copy of this course's Instructor object
	public Instructor getInstructor() {
		return new Instructor(instructor);
	}

	// @return A reference to a copy of this course's TextBook object
	public TextBook getTextBook() {
		return new TextBook (textBook);
	}

	// @return A string containing the course information.
	public String toString() {
		String str = "Course Name: " + courseName +
			     "\nInstructor Information:\n" + instructor +
			     "\nTextbook Information:\n" + textBook;
		return str;
	}
}

