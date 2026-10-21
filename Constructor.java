public class Constructor {
	private String name;
	private int age;

	// This constructor initializes a new person's details.
	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
        this.salary=salary
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		Constructor person = new Constructor("Kavya", 20);
		person.displayDetails();

	}
}
