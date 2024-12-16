class GrandFather{
    public String lastname;
    private int salary;
    protected String property;
    boolean hasVehicle;
    
    void displayInfo(){
        System.out.println(lastname + " from grandfather");
    }
}
// 1. Single level, one parent one child
class Father extends GrandFather{
    public String middleName;
    void displayName(){
        System.out.println(lastname + " " + middleName);
    }
}
// 2. Multi level, child class has a child class
class Child extends Father{
    String collegeName;
    void displayCollege(){
        System.out.println("Child college");
    }
}
// 3. Heirarical, one class has multiple child
class Brother extends Father{

}
class Sister extends Father{

}

public class Inheritance{
    public static void main(String[] args){
        Child child = new Child();
        // child class inherits the property/
        // function of parent (non private)
        child.lastname = "XYZ";
        child.property = "10";
        child.hasVehicle = true;
        child.displayInfo();
    }
}