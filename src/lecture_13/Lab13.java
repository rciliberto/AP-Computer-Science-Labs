/*	lecture 13 lab, AP Computer Science
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
package lecture_13;
import java.util.Arrays;

public class Lab13 {
	public static void main(String[] args){
		int[] a1 = {12, 34, 56};
		int[] a2 = {20, 50, 80};
		swapAll(a1, a2);
		System.out.println(Arrays.toString(a1));  // [20, 50, 80]
		System.out.println(Arrays.toString(a2));  // [12, 34, 56]
	}
	
	public static int computeOdd(int[] arr){
		int sum=0; 
		for (int i=0; i<arr.length; i++){
			if(arr[i]%2==1) sum+=arr[i];
		}
		
		return sum;
	}
	
	public static void swapAll(int[] arr1, int[] arr2){
		int[] arr=Arrays.copyOf(arr1, arr1.length);
		for(int i=0; i<arr1.length; i++){
			arr1[i]=arr2[i];
		}
		
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr[i];
		}
	}
	
	public static int[] merge(int[] arr1, int[] arr2){
		int[] out= new int[arr1.length+arr2.length];
		
		for (int i=0; i<arr1.length; i++){
			out[i]=arr1[i];
		}
		
		for (int i=arr1.length; i<arr2.length; i++){
			out[i]=arr2[i];
		}
		
		return out;
	}
}
