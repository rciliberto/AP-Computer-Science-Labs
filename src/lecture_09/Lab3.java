/*	lecture 9 lab, AP Computer Science
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
package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(in);	//Declare and initialize 
		
		out.print("Enter a sentence: ");	//Print instructions
		String str=input.nextLine();	//Get user input
		out.println("There are " + countSpaces(str) + " spaces");	//Print the number of spaces
		input.close();	//Close scanner
	}
	
	public static int countSpaces(String str){	//Accepts a String
		int count=0;	//Store the number of spaces in an integer
		
		for (int i=0; i<str.length(); i++){	//Cycle through the indexes of the String
			if (str.charAt(i)==' ') count++;	//If the character at index i is a space, increment the count
		}
		
		return count;	//Return the count
	}
}
