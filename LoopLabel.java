public class LoopLabel{
    public static void main(String[] args){
        // Loop effeciency
        // When the iteration is fixed use, for loop
        for(int idx = 0;  idx <= 3; idx ++ ){
            System.out.println("Index " + idx);
        }

        // When the iteration is not fixed use, while loop
        int number = 20;
        while(true){
            if(number % 3 == 0){
                break;
            }
            System.out.println("Number " + number);
            number += 2;
        }

        meroNamm: for(int first = 0; first <= 2; first ++){
            System.out.println("First " + first);
            for(int second = 0; second <= 4; second ++){
                System.out.println("Second " + second);
                if(second == 1){
                    break meroNamm;
                }
            }
        }
    }
}