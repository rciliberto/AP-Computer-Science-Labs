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

public class Lab1 {
	public static void main(String[] args){
		Scanner input = new Scanner(in); //Declare and initialize new Scanner object
		
		out.print("Enter a sentence: "); //Get input from user and store in a String
		String str=input.nextLine(); 
		
		int count=0;	//Store number of vowels in the sentence
		for (int i=0; i<str.length();i++){ //loop through indexes of input and count number of vowels using isVowel method
			if (isVowel(str.charAt(i))) count++;	//If there is a vowel at index i, increment count;
		}
		out.println("There are " + count + " vowels."); //Print number of vowels
		input.close(); //Close scanner object
	}
	
	public static boolean isVowel(char str){	//Accepts a char
		return (str=='a' | str=='e' | str=='i' | str=='o' | str=='u'); //Returns true if the given char is a vowel
	}
}
