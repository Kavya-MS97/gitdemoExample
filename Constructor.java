public class Constructor {
	private String name;
	private int age;

	// This constructor initializes a new person's details.
	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
        System.out.println("This is a constructor example.");
	}

	public static void main(String[] args) {
		Constructor person = new Constructor("Kavya", 20);
		person.displayDetails();

	}
}
