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

public class ModifiedPrintPrimes {
	public static void main(String[] args){
		printPrimes(50);
	}
	
	public static void printPrimes(int n){
		boolean first=true;
		for(int i=2; i<=n; i++){
			if(isPrime(i)){
				if(first){
					System.out.print(i);
					first=false;
				}
				else System.out.print(", " + i);
			}
		}
	}
	
	public static boolean isPrime(int n){
		int numOfFactors=0;
		for(int i=1; i<n; i++){
			if(n%i==0) numOfFactors++;
			if(numOfFactors==2) return false;
		}
		return true;
	}
}
