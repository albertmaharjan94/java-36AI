import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        // import java.util.Scanner;
        // copy this line on the top of this file
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int intInput = scan.nextInt();

        // System.out.println("Over 18?");
        // boolean boolInput = scan.nextBoolean();

        // // When using input for string after primitive datatype
        // // use scan.nextLine() to clear buffer of "enter" button
        // scan.nextLine();
        // System.out.println("Name?");
        // String stringInput = scan.nextLine();
        // System.out.println(intInput);
        // System.out.println(boolInput);
        // System.out.println(stringInput);
        // scan.close(); // close scan to avoid input lock

        // Task 
        // Use scanner to take input like the following
        // Ask user for their name, age and weight
        // name is string, age is int, weight is double, use nextDouble()
        // Using System.out.printf
        // Print the following
        // Name: Myname, Age: 20, Weight: 70.11
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        String name = scan.nextLine();
        System.out.println("Age");
        int age = scan.nextInt();
        System.out.println("Weight");
        double weight = scan.nextDouble();
        System.out.printf("Name: %s, Age: %d, Weight: %f", name, age, weight);
        scan.close();
    }
}