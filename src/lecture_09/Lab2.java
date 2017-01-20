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

public class Lab2 {
	public static void main(String[] args){
		Scanner input = new Scanner(in);	//Declare and initialize new Scanner object
		
		out.print("Enter a word: ");	//Print instructions
		String str=input.nextLine();	//Get user input
		out.println(oddEven(str));		//Print separated input
		input.close();	//Close scanner
	}
	
	public static String oddEven(String str){	//Accepts a String
		String even="", odd="";	//Declare and initialize placeholder Strings
		
		for (int i=0; i<str.length(); i++){	//Cycle through the indexes of the String
			if (i%2==0) even += str.substring(i,i+1);	//Determine if the index is even and if so add it to the placeholder
			else odd += str.substring(i,i+1);	//Determine if the index is odd and if so add it to the placeholder
		}
		
		return even + " " + odd;	//Return the evens and the odds separated by a space
	}
}
