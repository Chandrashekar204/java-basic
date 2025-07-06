package constructor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Constructor main method!");
//        PrivateEmployeConsturctor privateEmployeConsturctor = new PrivateEmployeConsturctor();
        PrivateEmployeConsturctor object = PrivateEmployeConsturctor.getInstance();

    }
}
