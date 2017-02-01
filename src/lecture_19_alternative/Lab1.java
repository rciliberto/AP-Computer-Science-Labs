/* 	Lecture 19 Lab 1, AP Computer Science
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
package lecture_19_alternative;
import java.util.ArrayList;

public class Lab1 {
	public static int smallest(ArrayList<Integer> array){
		int smallest=array.get(0);
		
		for(int i=0; i<array.size(); i++){
			if(smallest>array.get(i)) smallest=array.get(i);
		}
		
		return smallest;
	}
	
	public static String longest(ArrayList<String> array){
		int indexOfLongest=0;
		
		for(int i=array.size(); i>=0; i--){
			if(array.get(indexOfLongest).length()<=array.get(i).length()) indexOfLongest=i;
		}
		
		return array.get(indexOfLongest);
	}
	
	public static void remove(ArrayList<Double> array, double x){
		while(array.indexOf(x)!=-1){
			array.remove(array.indexOf(x));
		}
	}
}
