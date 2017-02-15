/* 	Weekly Assignment 1 Lab (Value Class), AP Computer Science
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

public class Value {
	private int value, counter;
	
	public Value(int value){
		this.value=value;
		this.counter=1;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int getCounter(){
		return this.counter;
	}
	
	public void increment(){
		this.counter++;
	}
	
	public String toString(){
		return "("+value+" x"+counter+")";
	}
}
