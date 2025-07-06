package constructor;

public class ChainConstructor {
    int empid;
    String empName;

    ChainConstructor(){
        this(103);
    }

    ChainConstructor(int empid){
        this(empid, "Default Name");
    }

    ChainConstructor(int empid, String empName){
        this.empid = empid;
        this.empName = empName;
    }
}
