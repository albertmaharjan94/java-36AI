// abstract keywordd before class
abstract class MailClass{
    // abstract class can have both abstract and normal function
    void displayMessage(){
        System.out.println("Displaying message");
    }
    abstract void send(); 
    // when a function is abstract it has no body
    public abstract boolean sent();
    // abstract is added after access modifier
    String sender = "shital@gmail";
    String receiver = "dikshant@gmail";
    // can have normal variable
    // Note: when a class has at least one abstract function
    // whole class needs to be abstract
    // we cannot make an object of abstract class
}
// to use abstract class we need to inherit
class GmailClass extends MailClass{
    // when we inherit absract class
    // all the abstract function must be implemented
    @Override // this is optional
    void send(){
        System.out.println("Gmail sent mail");
    }
    @Override
    public boolean sent(){
        return true;
    }
}
// Make a abstract class ShapeClass
// make attribute area and perimeter
// make a abstract function calculateArea()
// make a abstract function calculatePerimeter()
// make a class called SquareClass extends ShapeClass
// make attribute side, implement the calculateArea and calculatePerimeter
// make a class called CircleClass extends ShapeClass
// make a attribute radius, implement the calculateArea 
// and caculatePerimeter of circle
// set the area and perimeter on both function
abstract class ShapeClass{
    double area, perimeter;
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class SquareClass extends ShapeClass{
    int sides;
    @Override
    void calculateArea(){
        area = sides * sides;
    }
    @Override
    void calculatePerimeter(){
        perimeter =  2 * (sides + sides);
    }
}
class CircleClass extends ShapeClass{
    int radius;
    @Override
    void calculateArea(){
        area = Math.PI * radius * radius;
    }
    @Override
    void calculatePerimeter(){
        perimeter =  2 * Math.PI * radius;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        GmailClass gm = new GmailClass();
        gm.send();
    }
}
