public class OperatorClass{
    public static void main(String[] args) {
        // Operators
        // Arithematic/ Mathematical
        int intVal1 = 20, intVal2 = 30;
        int addOperator = intVal1 + intVal2; // 20 + 30
        int minusOperator = intVal1 - intVal2; // 20 - 30
        int mulOperator = intVal1 * intVal2; // 20 * 30
        int divOperator = intVal1 / intVal2; // 20 /30
        int modOperator = intVal1 % intVal2; // 20/30 -> rem

        // Assigment/ Variable assignment
        int assignVar = 10; 
        assignVar += 10; // 10 + 10 -> 20
        assignVar -= 5; // 20 - 5 -> 15
        assignVar *= 2; // 15 * 2 -> 30
        assignVar /= 3; // 30 / 3 -> 10
        assignVar %= 5; // 10 % 2 -> 0

        // Relational Operator / two value/variable
        boolean greaterThan = 10 > 3; // is 10 greater than 3?  true
        boolean equalsTo = intVal1 == intVal2; // is 20 == 30 ? false
        boolean lessThanEquals = 10 <= 10; // is 10 less or equals to 10? true
        
        // Logical Operator
        // && , || , !
        boolean andOper = true && true;
        int logVar1 = 20, logVar2 = 30, logVar3 = 20;
        boolean andOper2 = (logVar1 < logVar2) && (logVar1 > logVar3); // true && false
        boolean orOper = false || true || false;
        boolean orOper2 = (logVar1 < logVar2) || (logVar1 > logVar3); // true || false
        boolean notOper = !(logVar1 < logVar2); // not true 

        // Unary Operator
        // ++, --
        int unaryInt = 10;
        unaryInt ++ ; // unaryInt+=1;  unaryInt = 10 + 1; 11
        unaryInt -- ; // unaryInt -= 1; unaryInt = 11 - 1; 10

        // Ternary / Single line if/else logic
        // variable = (condition) : expression1 : expression2
        /*
         * String status;
         * int mathMark = 10;
         * int englishMark = 20;
         * if(mathMark > 40 && englishMark > 40){
         *   status = "Pass";
         * }else{
         *   status = "Fail";
         * }
         */
        int mathMark = 10;
        int englishMark = 20;
        String status = (mathMark > 40 && englishMark > 40) ? "Pass" : "Fail";
        System.out.println("Status : " + status);

        /*
         * make the following marking
         * oop -> int
         * database -> int
         * architecture -> int
         * creativeThinking -> int
         * calculate the average and store in
         * avg -> float
         * make a boolean condition that checks
         * if all the subject has highter than 30
         * and check if the avg is greater than 40
         * make a variable result String 
         * and if the conditions are true store "Good job" else
         * store "Bad job" in ternary
         */
        int oop = 20;
        int database = 50;
        int architecture = 30;
        int creativeThinking = 60;
        float avg = (float) (oop + database + architecture + creativeThinking) / 4;
        boolean condition = (oop > 30 && 
            database > 30 && 
            architecture > 30 && 
            creativeThinking > 30 && avg > 40);
        String result = condition ? "Good Job" : "Bad Job";
        System.out.println("Result : " + result);   
    }
}