import java.util.ArrayList; 
public class ArrayListExample{
    public static void main(String[] args){
        // import at the top
        ArrayList<String> fruits = new ArrayList<>(); // []
        // <Datatype> takes class only
        // int -> <Integer>, boolean -> <Boolean>, double -> <Double>, float <Float>
        // add
        fruits.add("Apple"); // ["Apple"]
        fruits.add("Mango"); // ["Apple", "Mango"]
        fruits.add("Oramge"); // ["Apple", "Mango",  "Oramge"]
        // get/ access
        // Can print the arraylist as a whole
        System.out.println(fruits); 
        // get with index
        System.out.println("Fruits 1st data/elem " + fruits.get(0));

        // update
        fruits.set(2, "Orange"); // ["Apple", "Mango", "Orange"]
        fruits.set(0, "Watermelon"); // ["Watermelon", "Mango", "Orange"]
        // remove
        fruits.remove(0); // removes at 0 index
        // ["Mango", "Orange"]

        // Loop 
        int arrayListSize = fruits.size();
        // index 0
        // index < size
        // loop and get each value
        for(int index = 0; index < fruits.size() ; index ++){
            System.out.println("Data in fruits " + fruits.get(index) );
        }

        // ["Mango", "Orange"]
        // For each
        for(String elem: fruits){
            System.out.println("Element " + elem);
        }
        // automatically loops per size of the list
        // elem-> get single data per loop

        // task 1
        // Make an arratlist called grades and add the following
        // 'A, 'B', 'z', 'c', 'D', 'E', 'G'
        // To make arraylist, ArrayList<Character> grades; 
        // Edit the small c to capital 'C'
        // Edit the G to 'F'
        // print the first and last grade
        // remove the 'z'
        // print the 'E' grades
        // loop the grades and find the index of 'F'

    }
}