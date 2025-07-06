package constructor;

public class Employe {
    private String name;
    private int age;

    // Default constructor
    public Employe() {
        this.name = "Unknown";
        this.age = 0;
    }

    int Employe(){
        return 0;
    }

    // Parameterized constructor
    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
