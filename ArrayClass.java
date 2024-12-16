public class ArrayClass{
    public static void main(String[] args){
        // [] after a datatype in variable
        // 1. Declaration and allocation later
        int[] arr1;
        // Allocation -> size of array
        arr1 = new int[5]; // arr1 can store 5 integer value
        
        // 2. Declaration and allocation in same line
        int[] arr2 = new int[2]; 

        // 3. Declaration and initialization
        int[] arr3 = {10, 20, 30, 40, 60};
        // index of arr3
        //  0    1   2   3  4 
        // {10, 20, 30, 40, 60}
        // To get the size of array, use .length
        System.out.println("Arr3 has " + arr3.length);

        // Array mutate
        arr3[1] = 20;
        arr3[4] = 300;
        // {10, 20, 30, 40 ,300}

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[3]);

        // illegal array operation
        // arr3[0]  = "test123"; // cannot mismatch datatype
        // arr3[10] = 10; // cannot access index more than length

        // Task 
        // Make an array called names with size of 3
        // and add the following name
        // Ram, Shyam, Ganashyam
        // Print all the names
        // change Ram to Sitaram
        // change Ganashyam to Sital
        // Print all the names again 
        String[] names = new String[3];
        names[0] = "Ram";
        names[1] = "Shyam";
        names[2] = "Ganashyam";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        names[0] = "Sitaram";
        names[2] = "Sital";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // Task 2
        // Make an array called grades as char
        // Add the following data
        // A,B,C,D,E,F
        // print the first and last element of the grades
        char[] grades = new char[6];
        grades[0] = 'A';
        // ..
        grades[5] = 'F';
        
        // First index of array -> 0
        // Last index of array -> grades.length - 1 
        // 2 condition to iterate/loop array
        // 1. index <= grades.length -1
        // 2. index < grade.length
        for(int index = 0; index < grades.length; index ++ ){
            // each value can be access using
            // arr[index] -> grades[index]
            System.out.println("Data at " + index + " is " + grades[index]);
        }

        // Task
        // Make an array like the following
        // 1, 22, 33, 44, 55, 66, 77, 88, 101
        // loop the array
        // and print the even number from this array
        
         

    }
}