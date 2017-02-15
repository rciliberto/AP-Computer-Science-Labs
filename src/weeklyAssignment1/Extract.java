/* 	Weekly Assignment 1 Lab (Extract Class), AP Computer Science
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
package weeklyAssignment1;

public class Extract {
	public static void main(String[] args){
		System.out.println(digitSum(1999));
		System.out.println(hasAnOddDigit(1999));
		System.out.println(allDigitsOdd(1999));
		System.out.println(mostFrequentDigit(19922));
	}
	
	public static int digitSum(int n){
		int temp=n, sum=0;
		while(temp>0){
			sum+=temp%10;
			temp/=10;
		}
		return sum;
	}
	
	public static boolean hasAnOddDigit(int n){
		int temp=n;
		while(temp>0){
			if(temp%10%2==1) return true;
			temp/=10;
		}
		return false;
	}
	
	public static boolean allDigitsOdd(int n){
		int temp=n;
		while(temp>0){
			if(temp%10%2==0) return false;
			temp/=10;
		}
		return true;
	}
	
	public static int mostFrequentDigit(int n){
		int[] numbers=new int[10];
		int temp=n, digit;
		while(temp>0){
			digit=temp%10;
			numbers[digit]++;
			temp/=10;
		}
		
		int max=numbers[9], indexOfMax=9;
		for(int i=8; i>=0; i--){
			if(numbers[i]>=max) {
				max=numbers[i];
				indexOfMax=i;
			}
		}
		return indexOfMax;
	}
}
