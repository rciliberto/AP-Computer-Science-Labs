/*	lecture 3 lab, AP Computer Science
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
package lecture_03;

public class lab {
	public static void main(String[] args){
		printMath(8,9,2,4);
	}
	
	
	public static double average(int x, int y){
		return (double)((x+y)/2); //Return the average of two integers x and y
	}
	
	public static int difference(int x, int y){
		return Math.abs((x-y)); //Return the positive difference of two integers x and y
	}
	
	public static int square(int x){
		return x*x; //Return the square of an integer x
	}
	
	public static double slope(int x1, int y1, int x2, int y2){
		return (double)(y1-y2)/(x1-x2); //Return the slope of two points given as (x1,y1) and (x2,y2)
	}
	
	public static double distance(int x1, int y1, int x2, int y2){
		return Math.sqrt(square(difference(x1,x2))+square(difference(y1,y2))); //Return the difference of two points given as (x1,y1) and (x2,y2)
	}
	
	public static void printMath(int x, int y, int a, int b){
		System.out.println("The average of " + " is " + average(x,y)); //Print the average of the first x and y values
		System.out.println("The slope of the line between ("+x+","+y+") and ("+a+","+ b+") is " + slope(x,y,a,b)); //Print the slope of two points given as (x,y) and (a,b)
		System.out.println("The distance between ("+x+","+y+") and ("+a+","+ b+") is " + distance(x,y,a,b)); //print the distance between two points given as (x,y) and (a,b)
	}
}
