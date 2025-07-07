package classes;

 class StaticClasses {
     int initialVariable = 10;
        static int staticVariable = 20;

        static class StaticInnerClass {
            void display() {
                System.out.println("Static Inner Class"+staticVariable+
                        "\nInitial Variable: " + new StaticClasses().initialVariable);
            }
        }
}
