package genericclasses;

public class Print {
    Object value;

    public  Object getPrintValue() {
        return value;
    }

    public void setPrintValue(Object object) {
        this.value = object;
        System.out.println("Value: " + value);

    }

    public static void main(String[] args) {
        Print print = new Print();
        print.setPrintValue("hello world");
        Object printvalue = print.getPrintValue();
        if ((String)printvalue == "hello world") {
            System.out.println("Value is 1");
        } else {
            System.out.println("Value is not 1");
        }
    }
}
