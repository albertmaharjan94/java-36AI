// "interface" keywoard
interface AnimalDo{
    // inteface is list of abstract functions
    // all the functions are automatically 
    // abstract
    public void eat();
    public void sleep();
    public int legs();
}
interface DomesticDo{
    public void pet();
}
// to use interface, use "implements" in a class
// can implement multiple interface
class PetDog implements AnimalDo, DomesticDo{
    // if interface is implemented 
    // all the function should be
    @Override
    public void eat(){
        System.out.println("Dog eat");
    }
    @Override
    public void sleep(){
        System.out.println("Dog sleep");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void pet(){
        
    }

}
public class Interface {
    public static void main(String[] args) {
        
    }
}
