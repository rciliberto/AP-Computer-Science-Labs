/*
 * 	Lecture 19 Lab 1, AP Computer Science
 * 
 *  Copyright (C) 2017  Robert Ciliberto
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
import java.util.ArrayList;

public class Lab1 {
	public static int smallest(ArrayList<Integer> array){
		int smallest=array.get(0); // Save the first item as the smallest
		
		for(int i=1; i<array.size(); i++){ // Iterate through all numbers in the list (first can be skipped because it is already saved as longest)
			if(smallest>array.get(i)) smallest=array.get(i); // If the current number is smaller than the saved smallest set the smallest to the current number
		}
		
		return smallest;
	}
	
	public static String longest(ArrayList<String> list) {
		String longest = list.get(0); // Save the first string as the longest
		for (int i = 1; i < list.size(); i++) { // Iterate through all strings in the list (first can be skipped because it is already saved as longest)
			if (list.get(i).length() > longest.length()) { // If the current string is longer than the saved longest...
				longest = list.get(i); // set the longest to the current string
			}
		}
		return longest;
	}
	
	public static ArrayList<Double> remove(ArrayList<Double> array, double x){
		while(array.indexOf(x)!=-1){ // Loop until x isn't found in list
			array.remove(array.indexOf(x)); // Remove first value of x
		}
		return array;
	}
}
