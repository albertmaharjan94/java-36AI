public class VariableExample{
    // Instance variable
    int instanceVariable = 100;
    String firstName = "Mero name";

    // Instance variable can only be used with object of the class
    // Static Variable
    static boolean staticVariable = false;
    // keyword "static" is used before the datatype to create static variable
    
    // local variable is made inside method/construcuter/block
    void firstFunction(){
        int localVariable = 50;
        // Local variable can only be used inside this function scope
        System.out.println("Local Variable : " + localVariable);
    }
    public static void main(String[] args) {
        int intVariable = 100; // this is also considered as local variable
        // It is under a main function

        // To use instance variable we need to make object of the class
        // Syntax: ClassName obj = new ClassName();
        VariableExample variableExampleObj = new VariableExample();
        // use instance variable from obj/class variable
        variableExampleObj.instanceVariable = 200;
        System.out.println(variableExampleObj.instanceVariable);

        VariableExample variableExampleObj2  = new VariableExample();
        System.out.println("Second Obj: " + variableExampleObj2.instanceVariable);

        // Static vairable can be used from ClassName.variable
        System.out.println("Static Variable " + VariableExample.staticVariable);
        VariableExample.staticVariable = true;
        System.out.println("Static Variable " + VariableExample.staticVariable);

        // Type Casting - Primitive data type conversion
        // Widening Casting/Implicit Casting (automatically)
        // From smaller datatype to larger datatype (capacity/size)
        // byte -> short -> char -> int -> long -> float -> double
        byte byteVar = 10;
        short shortVar = byteVar; // automatically converts byte to short datatype

        int intVar1 = 300;
        float floatVar2 = intVar1; // automatically converters int to float datatype (300.0)

        // Narrowing Casting/Explicit Casting (manual)
        // From larger datatype to smaller datatype
        double doubleVar = 10.44;
        int intConver = (int) doubleVar; // manual conversaion -> 10
        int intConver2 = (int) 100.22f; // cast before value

        // What can be the output of the following?
        float floatCalc = (float) 1/2;
        System.out.println(floatCalc);


        /*
         * Task
         * Continue
         * Make a new Instance Variable called firstName
         * Make a new object and print the firstname
         * 
         * Calculate and print the following:
         * double avgMarks = 60/4
         * float gpa = 400/200
         */
        VariableExample ve = new VariableExample();
        System.out.println(ve.firstName);
        double avgMarks = (double) 60/4;
        System.out.println(avgMarks);
        float gpa = 400.0f/200.0f;
        System.out.println(gpa);
    }
}