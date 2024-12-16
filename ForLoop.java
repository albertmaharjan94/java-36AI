public class ForLoop{
    public static void main(String[] args){
        // 1. Initialize
        // 2. Condition/Boolean expression
        // 3. Update/Modify
        for(int var = 1; var < 6; var ++){
            // statement
            System.out.println("Loop " + var);
            // var ++
        }

        // decrement
        int var2; // declare and initialize in for
        for(var2 = 5; var2 >= -3; var2 -= 2 ){ 
            System.out.println("Loop decrement by two " + var2);
        }

        // nested loop
        for(int outer = 1; outer <= 3; outer ++ ){ // 1,2,3
            System.out.println("Outer loop " + outer);
            for(int inner = 3; inner > 0; inner --){ // 3,2,1
                System.out.println("Inner loop " + inner);
            }
            System.out.println("Inner loop exit");
        }
        System.out.println("Outer loop exit");
        
        // Task 1
        // Make a multiplication table of 3
        // 3 x 1 = 3
        // 3 x 2 = 6
        // ..
        // 3 x 20 = 60

        // Task 2
        // Make a multiplication like following using nested for loop
        // Multiplication table of 10
        // 10 x 1 = 10
        // ..
        // 10 x 10 = 100
        // ..
        // Multiplication table of 2
        // 2 x 1 = 2
        // ..
        // 2 x 10 = 20
    }
}