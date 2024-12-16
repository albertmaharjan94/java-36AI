class CarExample{
    int year; // default -> 0
    String brand; // default -> null
    boolean electic; // default -> false
    // Constructor same Function as ClassName
    // 1. Non Parameterized
    CarExample(){
        // this will run when CarExample c = new CarExample();
        System.out.println("Non parametarized constructor");
    }
    // 2. Parameterized 
    CarExample(int data){
        // this will run when one int is passed in constructor
        // CarExample c = new CarExample(10);
        System.out.println("Parametarized Constructor");
    }
    // Note:Constructor overloading,same constructor multiple time
    // but 1. change in number of parameter 
    // 2. change in data type and order
    CarExample(int data1, int data2){

    }
    CarExample(boolean data1, int data2){

    }
    // Use case
    CarExample(int year, String brand, boolean electic){
        this.year = year;
        this.brand = brand;
        this.electic = electic;
    }
}

// create a class called Laptop
// create private attribute brand, price, ram
// create a public attribute discount
// create a non param constructor and set 
// brand -> 'N/A', price -> 0, ram -> 2, discount -> 10
// create a param constructor and take brand and price
// set the brand and price to the class attr
// create a param constructor and take price, discount and brand
// set the price, disount and brand to class attr
// create a function called totalPrice() return the price after discount
// create 3 object with different constructor and print totalPrice


public class ConstructorExample{
    public static void main(String[] args){
        CarExample ce = new CarExample();
        // this will call non param

        CarExample ce2 = new CarExample(10);
        // this will call param
        CarExample ce2 = new CarExample(
            2002,"Mustang", false);
            // ce2.year = 2992;
    }
}