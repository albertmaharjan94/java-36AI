class StudentExample{
    // 1 Data-> Field/properties/attributes/data members
    // What defines a class, what defines a student
    String name;
    int id;
    char gender;
    String batch;
    // 2 Behaviors -> Functions/methods/procedures
    void study(){
        System.out.println(name + " is studying");
    }
    // public and static is not compulsary
}
// Create a class Dog
// create attributes
// - name, breed, age, color
// create a function bark() 
// that prints "Dog's <name> is barking"
// create a function eat()
// if Dog is black ->print "<Breed> dog is eating chicken"
// else -> print "<Breed> dog is eating turkey"
// Make 2 objects of dog one black one orange
// fill the attribute and call the functions
class Dog{
    String name;
    String breed;
    int age;
    String color;
    void bark(){
        System.out.println("Dog's " + name + " is barking");
    }
    void eat(){
        if(color.equals("black")){
            System.out.println(breed + " dog is eating chicken");
        }else{
            System.out.println(breed + " dog is eating turkey");
        }
    }
}
public class ClassObject{
    public static void main(String[] args){
        // class should be made in global scope
        // above or below ClassObject
        
        // Object -> actual implementaion of a class
        StudentExample student1 = new StudentExample(); 
        // physical entity/ takes memory
        student1.name = "Shital";
        student1.id = 1001;
        student1.gender = 'M';
        student1.batch = "36-AI";
        
        System.out.println(student1.name);
        System.out.println(student1.id);

        // call function
        student1.study(); 
        // the name inside this function relates to the
        // name assigned in student1 object

        // create an object of Dikshanta
        StudentExample student2 = new StudentExample();
        student2.name = "Dikshanta";
        // ...

    }
}