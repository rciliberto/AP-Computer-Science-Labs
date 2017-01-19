package lecture_05;

public class Lab1 {
    public static void main(String[] args) {
        multipleOf3(7,18); // 9 12 15 18
        multiple4Not5(21); // 4 8 12 16
        printList(2,7); // 2 4 6
        printList(9,3);  // 3 5 7 9
    }

    /**
     * Creates a list of numbers between two numbers
     * @param a A number
     * @param b Another number
     * @return An array of integers containing the numbers between a and b, inclusive
     */
    private static int[] getBetween(int a, int b) {
        int[] array = new int[Math.abs(b - a) + 1]; // Create a new array to hold all the number between a and b, inclusive
        int iter = 0;
        if (a == b) { // If they are equal, return an array with that value
            return new int[]{a};
        } else if (a < b) {
            for (; a <= b; a++) { // Increment a until it equals b
                array[iter++] = a; // Put the current value of a into the next empty spot in the array
            }
        } else {
            for (; b <= a; b++) { // Increment b until it equals a
                array[iter++] = b; // Put the current value of b into the next empty spot in the array
            }
        }
        return array;
    }

    public static void multipleOf3(int m, int n) {
        for (int num : getBetween(m, n)) { // Iterate through all the numbers between m and n
            if (num % 3 == 0) System.out.print(num + " "); // Print num if it's divisible by 3
        }
        System.out.println();
    }

    public static void multiple4Not5(int m) {
        for (int num : getBetween(1, m)) { // Iterate through all the numbers between 1 and m
            if (num % 4 == 0 && num % 5 != 0) System.out.print(num + " "); // Print num if it's divisible by 4 and not 5
        }
        System.out.println();
    }

    public static void printList(int a, int b) {
        for (int num : getBetween(a, b)) { // Iterate through all the numbers between a and b
            if (a > b && num % 2 != 0) System.out.print(num + " "); // If a is larger than b, print num if it's odd (not divisible by 2)
            if (b > a && num % 2 == 0) System.out.print(num + " "); // If b is larger than a, print num if it's even (divisible by 2)
        }
        System.out.println();
    }
}
