/*	lecture 4 lab, AP Computer Science
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
package lecture_04;

public class Lab1 {
	public static void main(String[] args){
		double height=70;	//Store height (in inches) in a double
		double weight=194.25;	//Store weight (in pounds) in a double
		
		System.out.println("Height (in inches): " + height);	//Print height
		System.out.println("Weight (in pounds): " + weight);	//Print weight
		System.out.println("BMI = " + bmi(height,weight));	//Print BMI
		System.out.println(weightClass(height,weight));	//Print weight class
	}
	
	public static double bmi(double height, double weight){	//Accepts a double for height in inches and weight in pounds
		return 703*(weight/Math.pow(height,2));	//Return the BMI (703*(weight/height^2))
	}
	
	public static String weightClass(double height, double weight){	//Accepts a double for height in inches and weight in pounds
		double bmi=bmi(height,weight);	//Store BMI in a double
		if(bmi>=30)	return "obese";	//Check if obese and return if so
		if(bmi>=25) return "overweight";	//Check if overweight and return if so
		if(bmi>=18.5) return "normal";	//Check if normal and return if so
		return "underweight";	//Otherwise return "underweight"
	}
}
