package constructor;

public class PrivateEmployeConsturctor {
    String name;
    int age;

    //'PrivateEmployeConsturctor()' has private access in 'constructor.PrivateEmployeConsturctor'
    private PrivateEmployeConsturctor() {
        this.name = "Unknown";
        this.age = 0;
    }

    static PrivateEmployeConsturctor getInstance() {
        return new PrivateEmployeConsturctor();
    }
}
