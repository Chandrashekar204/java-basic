package constructor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Constructor main method!");
        Doctor doctor1 = new Doctor("John Doe", 35, "Cardiology");
        doctor1.displayDetails();

    }
}
