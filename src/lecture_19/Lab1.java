/*
 * 	Lecture 19 Lab 1, AP Computer Science
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
 
package lecture_19;

import java.util.*;

public class Lab1 {
	public static void main(String[] args) {
		// Create 3 array lists, of integers, strings, and doubles
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3); numbers.add(2); numbers.add(4);
		numbers.add(7); numbers.add(9);
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat"); strings.add("go"); strings.add("ants");
		strings.add("apple"); strings.add("pineapple");
		ArrayList<Double> doubles = new ArrayList<Double>();
		doubles.add(3.2); doubles.add(3.2); doubles.add(4.6);
		doubles.add(7.62); doubles.add(3.2); doubles.add(9.1);
		
		// Test the methods
		System.out.println(smallest(numbers));
		System.out.println(longest(strings));
		System.out.println(remove(doubles, 3.2));
	}
	
	public static int smallest(ArrayList<Integer> list) {
		int smallest = list.get(0); // Save the first item as the smallest
		for (int i = 0; i < list.size(); i++) { // Iterate through all numbers in the list
			if (list.get(i) < smallest) { // If the current number is smaller than the saved smallest...
				smallest = list.get(i);   // set the smallest to the current number
			}
		}
		return smallest;
	}
	
	public static String longest(ArrayList<String> list) {
		String longest = list.get(0); // Save the first string as the longest
		for (int i = 0; i < list.size(); i++) { // Iterate through all strings in the list
			if (list.get(i).length() > longest.length()) { // If the current string is longer than the saved longest...
				longest = list.get(i); // set the longest to the current string
			}
		}
		return longest;
	}
	
	public static ArrayList<Double> remove(ArrayList<Double> list, double x) {
		for (int i = 0; i < list.size(); i++) { // Iterate through all doubles in the list
			if (list.get(i) == x) { // If the current double equals the given double "x"
				list.remove(i--); // Remove the double from the list and decrement i to avoid skipping
			}
		}
		return list;
	}
}
