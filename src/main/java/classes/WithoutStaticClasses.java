package classes;

public class WithoutStaticClasses {
          int outerVariable = 10;
          static int staticVariable = 20;

          class InnerClass {
                    void display() {
                              System.out.println("Inner Class" + staticVariable +
                                                  "\nOuter Variable: " + outerVariable);
                    }
          }

          public static void main(String[] args) {
                    WithoutStaticClasses outer = new WithoutStaticClasses();
                    WithoutStaticClasses.InnerClass inner = outer.new InnerClass();
                    inner.display();
          }
}
