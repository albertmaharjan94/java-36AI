public class ArrayDimension{
    public static void main(String[] args){
        // the number of [] determines the array dimension
        // 1. One dimension array
        int[] arr1D = new int[2];
        // 2. Two dimension array
        int[][] arr2D = new int[3][2];
        // 3. Three dimension array
        int[][][] arr3D = new int[2][2][1];

        // 2D array representation
        // arr2D with [3][2] -> first size 3 determines number of row inside
        // second size 2 determines the number of element/column inside each array
        //      0   1
        // [
        //   [  0, 20   ] -> 0 row
        //   [  0, 40   ] -> 1 row
        //   [  0, 0   ] -> 2 row
        //  ]
        arr2D[0][1] = 20; // 0 selects the row, 1 selects the column
        arr2D[1][1] = 40; 

        // Make a 2D array called colors with the following data
        // [
        //  [255, 244, 0]
        //  [233, 40, 255]
        //  [0, 0, 0]
        //  [244, 211, 111]
        //  [255, 255, 255]
        // ]
        
        int[][] colors = new int[5][3];
        colors[0][0] = 255;
        // .. 
        int[][] colors2 = {
            {255, 244, 0},
            {233, 40, 255},
            {0, 0, 0},
            {244, 211, 111},
            {255, 255, 255},
        };

        for(int row = 0; row < colors2.length; row ++){
            System.out.println("Selected row " + row);
            // colors2[row] is another array
            for(int column = 0; column < colors2[row].length ; column ++ ){
                System.out.println("Value " + colors2[row][column]);
            }
        }

        // Create a 2D array called seating
        // fill the data
        // [
        // ["Biplov", "Shital", "Roshan" , ""],
        // ["Kalina", "Pravina", "Jasmina" , "Manisha"],
        // ["Nisha", "Asma", "" , ""],
        // ["Samip", "Prochorus", "Gaurav" , ""],
        // ["Arbin", "Manish", "Hemant" , ""],
        // ["", "", "Simon" , "Ishneha"],
        // ]

        // Print the seating per row
        

    }
}