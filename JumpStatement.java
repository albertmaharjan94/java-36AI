public class JumpStatement{
    public static void main(String[] args){
        // Break and Continue
        // 1. Break, -> exits the scope of loop
        for(int i = 0; i <= 10; i ++){
            if(i == 3){
                break;
            }
            System.out.println("Break Number " + i);
        }
        // break exits to here

        for(int outer = 1; outer <= 4; outer ++){
            if(outer == 2){
                break;
            }
            for(int inner = 0; inner <= 2; inner ++){
                if(inner == 1){
                    break; // only breaks the current loop
                }
                System.out.println("Inner loop " + inner);
            }
            // inner loop breaks exits here
            System.out.println("Outer loop " + outer);
        }
        // outer break exits here

        // 2. continue -> skips the iteration
        for(int number = 10; number <= 15; number ++){
            if(number == 12){
                continue; // skips the iteration
                // the statement below this will be ignored
            }
            System.out.println("Number " + number);

            // end -> continue will skip till the end here
        }

        // Task
        // using continue
        // loop from 1 - 20
        // and print only the even numbers

        // Task2 (hw)
        // using continue and while
        // loop from 1 - 30
        // and print only the odd numbers
    }
}