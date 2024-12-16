public class StringParsing{
    public static void main(String[] args){
        String num1 = "10";
        String num2 = "20";
        System.out.println("Sum " + num1 + num2);
        // To calculate the numeric from string
        // use parse
        int num1Parsed = Integer.parseInt(num1);
        int num2Parsed = Integer.parseInt(num2);

        System.out.println("Parsed Sum " + (num1Parsed + num2Parsed));
        // Double.parseDouble("20.22")
        // Boolean.parseBoolean("False");
    }
}