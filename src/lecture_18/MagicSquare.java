/* 	lecture 18 lab, AP Computer Science
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
package lecture_18;

public class MagicSquare {	
	public static int rowSum(int[][] square, int row){
		int sum=0;
		for(int i=0; i<square.length; i++){
			sum+=square[row][i];
		}
		return sum;
	}
	
	public static int colSum(int[][] square, int col){
		int sum=0;
		for(int i=0; i<square.length; i++){
			sum+=square[i][col];
		}
		return sum;
	}
	
	public static boolean diagSums(int[][] square, int sum){
		int major=0, minor=0;
		int size=square.length;
		
		for(int i=0; i<size; i++){
			major+=square[i][i];
			minor+=square[i][size-i-1];
		}
		return (major==sum && minor==sum);
	}
	
	public static boolean exactlyOnce(int[][] square){
		int nums=(int)Math.pow(square.length,2);
		int[] count=new int[nums];
			
			for (int i=0; i<square.length;i++){
				for (int j=0; j<square[i].length;j++){
					if(square[i][j]<=nums)count[square[i][j]-1]++; 
		        }
			}
			for(int i=0;i<count.length;i++){
				if(count[i]!=1) return false;
		   }
		   return true;
	}
	
	public static boolean isMagic(int[][] square){
		int sum=rowSum(square, 0);
		
		for (int i=0; i<square.length; i++){
			if (rowSum(square, i)!=sum) return false;
			if (colSum(square, i)!=sum) return false;
		}
		
	    if (!diagSums(square, sum) || !exactlyOnce(square)) return false;
	    return true;
	}
}
