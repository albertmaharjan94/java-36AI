public class Function{
    // Function is made in a class scope, above or below main()
    // 1. modifier (public, private, default, protected)
    // 2. static -> without object, class reference
    // 3. returnType -> data type, what a function returns
    // 4. functionName -> identifier to call this function
    // 5. arguement/parameter -> what is expected from a function
    // Eg, int functionName(String data1, int data2)
    // int -> return type
    // String data1 -> arg1, int data2 -> args
    // functionName("meroName", 20);
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    // return type "void"-> donot have to return anything
    public static void greet(){
        System.out.println("Good friday");
    }

    // Task 1
    // Make a function studentDetail that returns String
    // takes an arguement firstName, lastName, age, gender
    // if the age is less than 18 and gender is 'M'
    // return "Sorry Mr. <Name>, you are not eligible"
    // if the age is less than 20 and gender is 'F'
    // return "Sorry Mrs. <Name> you are  not eligible"
    // else return "Congrats <Name>, you are eligible"
    // Print the data in main()
    public static String studentDetail(String fname, String lname, int age, char gender){
        String name = fname + " " + lname;
        if(age < 18 && gender == 'M'){
            return "Sorry Mr. " + name + ", you are not eligible";
        }
        if(age < 20 && gender == 'F'){
            return "Sorry Mrs. " + name + ", you are not eligible";
        }
        return "Congrats " + name + ", you are eligible";
    }
    // Task 2
    // Make a function square that returns int
    // takes 1 argement num1 as int
    // return square of the num
    public static int square(int num1){
        return num1 * num1;
    }
    public static void main(String[] args){
        int val1 = 10, val2 = 40;
        int returnedVal = add(val1, 30); // val1 becomes num1, 30 becomes num2
        System.out.println("Returned Value " + returnedVal);

        greet();
        greet();

        int squaredVal = square(5);
        // You can use Math class to do advanced calc
        double squaredVal2 = Math.pow(5, 2); // 5 to the power 2
        System.out.println(squaredVal2);
        // H/w
        // make a function sqrt that takes, one double and return 
        // Math.sqrt of the argument
        // loop from 1 - 10 and print the sqrt of 1 - 10
    }
}