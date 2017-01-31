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

public class MagicSquareTester {
	public static void main(String[] args) {
		int[][] square4={{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
		
		System.out.println(MagicSquare.rowSum(square4, 0));
		System.out.println(MagicSquare.colSum(square4, 0));

		System.out.println(MagicSquare.diagSums(square4, MagicSquare.colSum(square4, 0)));
		System.out.println(MagicSquare.exactlyOnce(square4));
		
		System.out.println(MagicSquare.isMagic(square4));
	}
}
