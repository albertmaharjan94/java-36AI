public class WhileLoop{
    public static void main(String[] args){
        int number = 5;
        while(number <= 4){
            System.out.println("Number " + number);
            // increment/decrement
            number ++;
        }

        // do while
        int number2 = 5;
        do{
            System.out.println("Do Number " + number2);
            number2 ++;
        }while(number2 <= 4);

        // Task 1
        // Using while print the following multiplication 
        // 3 x 1 = 3
        // 3 x 2 = 6
        // ..
        // 3 x 10 = 30
        // hint: num = 1, num <=10
        
        // Task 2
        // Using do while, print the following
        // 5 x 10 = 50
        // 5 x 9 = 45
        // ..
        // 5 x 0 = 0
        // hint: num = 10, num >=0

    }
}