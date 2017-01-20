/*	lecture 6 lab, AP Computer Science
 * 
 *  Copyright (C) 2017  David Shen
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lecture_06;

public class Lab1 {
    public static void fourHeads() {
        int numHeads = 0; // The number of consecutive heads
        while (numHeads < 4) { // Repeat until there are 4 consecutive heads
            boolean head = Math.random() > 0.5; // 50% chance the coin toss will be a head, stored as a boolean (true = heads, false = tails)

            if (head) { // If the coin shows heads, increase the heads count and print an "H"
                System.out.print("H ");
                numHeads++;
            } else { // If the coin shows tails, reset the heads count and print a "T"
                System.out.print("T ");
                numHeads = 0;
            }
        }
        System.out.println("\nFour heads in a row!");
    }

    public static void printTwoDigit(int n) {
        boolean has13 = false; // Boolean to update if a 13 is found
        for (int i = 0; i < n; i++) { // Repeat n times
            int current = (int) (Math.random() * 10 + 10); // Generate a random number between 10 (incl) and 20 (excl). Casting as int rounds down, so between 10 (incl) and 19 (incl).
            System.out.println("next = " + current); // Print the random number in the given format

            if (current == 13) has13 = true; // If the number is equal to 13, update the has13 boolean
        }

        if (has13) System.out.println("we saw a 13!"); // Print whether a 13 was found
        else System.out.println("no 13 was seen.");
    }
}
