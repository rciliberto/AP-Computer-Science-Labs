package lecture_18;

public class Lab1 {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // Iterate through all rows in the array
            for (int j = 0; j < array[i].length; j++) { // Iterate through all items in the row
                sum += array[i][j]; // Add the item to the sum
            }
        }
        return sum;
    }
    
    public static int rowSum(int[][] array, int row) {
        int sum = 0;
        for (int i = 0; i < array[row].length; i++) { // Iterate through all items in the row
            sum += array[row][i]; // Add the item to the sum
        }
        return sum;
    }
    
    public static int sum2(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // Iterate through all rows in the array
            sum += rowSum(array, i); // Add the sum of the row to the total sum
        }
        return sum;
    }
    
    public static int largest(int[][] array) {
        int largest = 0;
        for (int i = 0; i < array.length; i++) { // Iterate through all rows in the array
            for (int j = 0; j < array[i].length; j++) { // Iterate through all items in the row
                if (array[i][j] > largest) largest = array[i][j]; // If the item is greater than the current largest number, set the largest to the item
            }
        }
        return largest;
    }
    
    public static int largestByRow(int[][] array, int row) {
        int largest = 0;
        for (int i = 0; i < array[row].length; i++) { // Iterate through all items in the row
            if (array[row][i] > largest) largest = array[row][i];  // If the item is greater than the current largest number, set the largest to the item
        }
        return largest;
    }
    
    public static int largest2(int[][] array) {
        int largest = 0;
        for (int i = 0; i < array.length; i++) { // Iterate through all rows in the array
            if (largestByRow(array, i) > largest) largest = largestByRow(array, i); // If the largest value in the row is greater than the current largest number, set the largest to that largest number
        }
        return largest;
    }
    
    // Instead of iterating through first the rows and then the columns, we iterate first through the columns and then the rows in order to transpose the array
    public static void printTranspose(int[][] array) {
        for (int i = 0; i < array[0].length; i++) { // Iterate through all columns in the array
            for (int j = 0; j < array.length; j++) { // Iterate through all items in the column
                System.out.print(array[j][i]); // Print the value
            }
            System.out.println();
        }
    }
}
