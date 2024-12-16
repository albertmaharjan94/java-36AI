public class PrefixPostfix{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        // Prefix, ahead of variable/value ++number
        System.out.println("Prefix");
        System.out.println(++num1); // this changes the value of num1 in this line
        System.out.println(num1); // the value remains the same
        // Postfix, after vairable/value number++
        System.out.println("Postfix");
        System.out.println(num2++); // this doesnot change the num2 in this line
        System.out.println(num2); // num2 is changed in this line
    }
}