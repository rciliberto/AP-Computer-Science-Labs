/* 	Lecture 25 Lab 1, AP Computer Science
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
package lecture_25;

public class lab1 {
	public static void main(String[] args){
		int[] sortedArray={0,1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(sortedArray, 10));
	}
	public static int binarySearch(int[] a, int target){
		int i=a.length/2;
		int chunk=a.length/4;
		while(true){
			if(!(i>=a.length || i<0)){
				if(a[i]==target) break;
				else if(a[i]<target){
					i+=chunk;
					chunk-=chunk/2;
				}else{
					i-=chunk;
					chunk-=chunk/2;
				}
			}
			else return -1;
		}
		return i+1; 
	}
}
