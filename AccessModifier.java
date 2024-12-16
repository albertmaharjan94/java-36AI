// default class
class EmployeeExample{
    // Access modifier/ visibility modifier
    // 1. default -> when no modifier is specified
    // can be used within a same file/package/folder
    String name;
    // 2. public -> can be used from anywhere
    public String email;
    // 3. private -> can only be used inside this class
    private int salary;
    // 4. protected -> can be used within same file/package 
    // and subclass
    protected String lastName;

    // same for functions
    private void setSalary(int s){
        salary = s;
    }
    void printDetail(){
        setSalary(1000);
        System.out.println(name + " " + email + " " + salary);
    }
}
// this keyword -> class reference
class Calculator{
    private int num1; // this.num1
    private int num2; // this.num2

    void setNumbers(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int sum(){
        return this.num1 + this.num2;
    }
}
// Task
// Create a class called RectangleClass
// create two private properties, length and breadth
// create one public properties area
// create default properties perimeter
// create a function called setLength that takes length as argument
// set the length to the class length
// create a function called setBreadth that takes breadth as argument
// set the breadth to the class breadth
// create a public function called calculateArea()
// and set the class area to the calculated area
// creat a public function called calculatePerimeter()
// and set the class perimieter and also returns the perimeter
// create an object of RectangeClass
// use setLength and setBreadth and print the area and perimeter
class RectangeClass{
    private int length;
    private int breadth;
    public int area;
    int perimeter;

    void setLength(int length){
        this.length = length;
    }
    void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public void calculateArea(){
        this.area = this.length * this.breadth;
    }
    public int calculatePerimeter(){
        this.perimeter = 2 * (this.length + this.breadth);
        return this.perimeter;
    }
}

// public in class should be same as filename
public class AccessModifier{
    public static void main(String[] args){
        // Create object
        EmployeeExample e = new EmployeeExample();
        e.name = "Shital";
        e.email = "shital@gmail.com";
        // private cannot be used
        // e.salary = 19999; // see the error here
        e.lastName = "Yadav";

        // same for function
        e.printDetail();
        // e.setSalary(10000); // private function
        
        Calculator cc = new Calculator();
        cc.setNumbers(10, 20); // num1, num2
        int ret = cc.sum();
        System.out.println("Sum " + ret);
    }
}