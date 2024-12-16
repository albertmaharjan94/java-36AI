public class IfStatement{
    public static void main(String[] args){
        // If statement
        int num1 = 10;
        if(num1 == 10){
            System.out.println("Num1 is 10");
        }
        // If else statement
        if(num1 == 11){
            System.out.println("Num1 is 11");
        }else{
            System.out.println("Num1 is not 11");
        }
        // If else if statement - two condition
        if(num1 == 9){
            System.out.println("Num1 is 9");
        }else if(num1 == 10){
            System.out.println("Num1 else if is 10");
        }else{
            System.out.println("Num1 is not 9 or 10");
        }
        // If else if ladder
        String bevarage = "Coke";
        if(bevarage == "Fanta"){
            System.out.println("Orange Drink");
        }else if(bevarage == "Sprite"){
            System.out.println("Clear Drink");
        }else if(bevarage == "Coke"){
            System.out.println("Black Drink");
        }else{
            System.out.println("Unknwon Drink");
        }
        // Nested If 
        if(bevarage == "Coke"){
            if(num1 == 10){
                System.out.println("Coke and 10");
            }else{
                System.out.println("Only Coke");
            }
        }else{
            if(num1 == 10){
                System.out.println("Only 10");
            }else{
                System.out.println("No coke or 10");
            }
        }

        // Task 
        // Use if else if ladder for the following
        // make a variable int day and assign a number
        // if day is 0 -> print Sunday
        // if day is 1 -> print Monday
        // if day is 2 -> print Tuesday
        // if day is 3 -> print Wednesday
        // if day is 4 -> print Thursday
        // if day is 5 -> print Friday
        // if day is 6 -> print Saturday
        // if day is not between -> print Unknown day

        // Task 2 -> Use nested if
        // make a variable, double avgMark, and char gender
        // if avgMark is greater than 50 and gender is 'M' print "Good boy"
        // if avgMark is greater than 50 and gender is 'F' print "Good girl"
        // if avgMark is less than 50 and gender is 'M' print "Bad boy"
        // if avgMark is less than 50 and gender is 'F' print "Bad girl"
        double avgMark = 70.22;
        char gender = 'M';
        if(avgMark > 50){
            if(gender == 'M'){
                System.out.println("Good boy");
            }else if(gender == 'F'){
                System.out.println("Good girl");
            }else{
                System.out.println("Good unkown");
            }
        }else{
            if(gender == 'M'){
                System.out.println("Bad boy");
            }else if(gender == 'F'){
                System.out.println("Bad girl");
            }else{
                System.out.println("Bad unkown");
            }
        }
    }
}