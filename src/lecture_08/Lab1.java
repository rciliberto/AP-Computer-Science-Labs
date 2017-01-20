/*	lecture 8 lab, AP Computer Science
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
package lecture_08;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args){
		Scanner input = new Scanner(in);
				
		out.print("What is your full name: ");
		String name=input.nextLine();
		out.println();
		String first=name.substring(0,name.indexOf(" ")), last=name.substring(name.indexOf(" ")+1);
		out.println("Your gangster name is " + name.substring(0,1) + ". Diddy " + last.toUpperCase() + " " + first + "-izzle");
		input.close();
	}
}
