package constructor;

public class Doctor extends Employe {
    private String specialization;



    // Default constructor
    public Doctor() {
        super(); // Calls the default constructor of Employe
        this.specialization = "General";
    }

    // Parameterized constructor
    public Doctor(String name, int age, String specialization) {
        super(name, age); // Calls the parameterized constructor of Employe
        this.specialization = specialization;
    }

    // Method to display doctor details
    public void displayDetails() {
        super.displayDetails(); // Calls the display method from Employe
        System.out.println("Specialization: " + specialization);
    }
}
