import java.util.Scanner;
public class InputValidation{
    public static void main(String[] args){
        // use while to take input on repeat
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Please enter a number between 1-100");
        // int input = scan.nextInt();
        // while(input < 1 || input > 100){
        //     System.out.println("Invalid input, please enter between 1-100");
        //     input = scan.nextInt();
        // }

        // System.out.println("Congratulation");
        // scan.close();

        // Task
        // Promt user to "Enter your age"
        // if age is less than 18 -> print("Underage ") and ask the age again
        // Promt use to "Enter your gender"
        // if gender is not "Male" or gender is not "Female" 
        // or gender is not "Other" , ask user their gender again
        // "Invalid gender, please enter again"
        // Prompt user for their body temp
        // if the body temp is greater than 130.55 or less than 60.22 
        // prompt user to enter body temp again
        // "Invalid temperature try again"
        // Lastly print the following
        // Patient Detail
        // Age: 19
        // Gender: Male
        // Temp: 110.11
        Scanner scan = new Scanner(System.in);
        String strInput = scan.nextLine();
        // to compare two strings
        System.out.println(strInput == "test"); // doesnot work
        // use string.equals(compare)
        System.out.println(strInput.equals("test"));

    }
}