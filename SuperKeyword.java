class ParentClass{
    String firstname = "Parent ko name";
    ParentClass(){
        System.out.println("Parent non param constructor");
    }
    ParentClass(int num1){
        System.out.println("Parent param constructor");
    }
}
// super used to reference Parent class
class ChildClass extends ParentClass{
    String firstname = "Child ko name";
    void diff(String firstname){
        System.out.println(firstname); // argument firstname
        System.out.println(this.firstname); // child class firstname
        System.out.println(super.firstname); // parent class firstname
    }
    ChildClass(){
        // automatically calls Parent Constructor here
        // super() is run automatically here if not specified
        super(10);
        System.out.println("Child non param constructor");
    }
    ChildClass(int num1){
        // super();
        System.out.println("Child param constructor");
    }
}
// Task
// Make class VehicleClass
// with attribute brand, name, wheel and price
// Make a param constructor of Vehicle class that takes brand and name -> set the attr
// Make a param constructor of Vehicle class that takes brand, name, wheel and price
// Make a class BikeClass that extends Vehicle
// with attribute brand and name
// Make a non param constructor that sets the current brand and name as 'N/A'
// which also calls the param constructor of VehicleClass with brand, name, wheel and price
// 'Honda', 'XR', 2, 20000
// Make a param consturctor that takes brand and name
// set the current brand and name as args
// set the parents brand as 'Yamaha', name as 'R15', wheel as 2 and price as 120000

public class SuperKeyword{
    public static void main(String[] args){
        // ChildClass c1 = new ChildClass(); 
        // when making object of a child class
        // first parent constructor is ran
        ChildClass c2 = new ChildClass(10);
        c2.diff("Ram");
    }
}