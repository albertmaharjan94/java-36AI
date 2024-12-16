class PersonExample{
    private String name;
    private int age;
    private boolean hasVehicle;
    // PersonExample(String name){
    //     this.name = name;
    // }
    // Getter/Setter
    // 1. Getter -> Read/View only access
    // get has the same return type as the variable datatype
    // get has no paramter/arguemnt
    public String getName(){
        return this.name;
    }
    // 2. Setter -> Mutate/Write only access
    // set has no return type "void"
    // set thas the same parameter/arguement as the variable
    public void setName(String name){
        this.name = name;
    }

    // create a getter and setter for age and haseVehicle
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean getHasVehicle(){
        return this.hasVehicle;
    }
    public void setHasVehicle(boolean hasVehicle){
        this.hasVehicle = hasVehicle;
    }
}

// create a class called Teacher
// create a private propery firstname, lastname, age, boolean fulltime
// create a constructor that sets the first and lastname
// create a setter of age and fulltime
// on setter of age only set the age if it is greater than 0
// create a getter for all the attribute
// create 2 object, use constructor and setter to set the private property
// print the "<firstname> <lastname>, <age>" of both object


public class GetterSetter{
    public static void main(String[] args){
        PersonExample p1 = new PersonExample();
        p1.setName("Ram");
        System.out.println(p1.getName());
    }
}