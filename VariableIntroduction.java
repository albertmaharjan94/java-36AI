public class VariableIntroduction{
    
    public static void main(String[] args){
        // psvm
        // Primitive datatype
        // Variable Declaration
        boolean booleanVariable;
        // Initialization
        booleanVariable = true;
        // Declaration and initialization
        int intVariable = 10;
        // Mutliple Declaration
        float floatVariable1, floatVariable2, floatVariable3;
        // Initialization
        floatVariable1 = 10.33f;
        // Float value just end with the 'f' notation
        // Multiple Declaration and initialization
        char charVariable1 = 'c', charVariable2 = 'a', charVariable3 = 't';
        // char datatype has a value enclosed with single quote ''
        double doubleVariable = 10.22d; // letter d is optional
        // Limitations
        // byte byteVariable = 100000000; value cannot exceed the capacity
        // short shortVariable = false; value cannot be mismatched

        // Non-Primitive Datatype (String)
        String stringVariable = "Hello World";
        // String value must be enclosed in double quotation ""
        // Using constructer
        String stringVariable2 = new String("New string");
        // donot copy original: 
        
        /*
         * Task 
         * Declare the following variable
         * firstName String
         * lastName String
         * gender char
         * age int
         * over18 boolean
         * Initialize the above variable
         * Declare the multiple variable
         * mathMarking, englishMarking, scienceMarking as float
         * Initialize each variable
         * Declare and initialize the following variable
         * gpa, average as double
         * 
         */
        String firstName;
        String lastName;
        char gender;
        int age;
        boolean over18;
        firstName = "Mero first nanme";
        lastName = "Mero last name";
        gender = 'M';
        age = 100;
        over18 = true;
        float mathMarking, englishMarking, scienceMarking;
        mathMarking = 69.2f;
        englishMarking = 80.22f;
        scienceMarking = 70.32f;
        double gpa = 3.4d, average = 70.44;

    }
}