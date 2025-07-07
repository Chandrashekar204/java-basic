package classes;

public class PrivateInnerclasses {
    int outerVariable = 10;

    private class InnerPravteClass {
        public void display() {
            System.out.println("Inner Private Class: " + outerVariable);
        }
    }

    public void displayInner() {
        InnerPravteClass inner = new InnerPravteClass();
        inner.display();
    }
}
