/*	lecture 7 lab, AP Computer Science
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
package lecture_07;
import java.util.*;

public class ModifiedBMI {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your height: ");	//Get height
		double height=scanner.nextDouble();	//Store height (in inches) in a double
		System.out.print("Enter your weight: ");	//Get weight
		double weight=scanner.nextDouble();	//Store weight (in pounds) in a double
		System.out.println();	//Enter two lines
		System.out.println();
		
		System.out.println("Height (in inches): " + height);	//Print height
		System.out.println("Weight (in pounds): " + weight);	//Print weight
		System.out.println("BMI = " + bmi(height,weight));	//Print BMI
		System.out.println(weightClass(height,weight));	//Print weight class
		
		scanner.close();	//Close Scanner
	}
	
	public static double bmi(double height, double weight){	//Accepts a double for height in inches and weight in pounds
		return 703*(weight/Math.pow(height,2));	//Return the BMI (703*(weight/height^2))
	}
	
	public static String weightClass(double height, double weight){	//Accepts a double for height in inches and weight in pounds
		double bmi=bmi(height,weight);	//Store BMI in a double
		if(bmi>=30)	return "Obese";	//Check if obese and return if so
		if(bmi>=25) return "Overweight";	//Check if overweight and return if so
		if(bmi>=18.5) return "Normal";	//Check if normal and return if so
		return "Underweight";	//Otherwise return "underweight"
	}
}
