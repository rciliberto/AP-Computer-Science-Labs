/* 	Weekly Assignment 1 Lab (Mode Class), AP Computer Science
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
import java.util.ArrayList;

public class Mode {
	public static void main(String[] args){
		int[] array={1,2,3,4,4,5};
		System.out.println(mode(array));
	}
	
	public static int mode(int[] array){
		ArrayList<Value> list=new ArrayList<Value>();
		
		for(int value : array){
			int indexOfValue=find(list, value);
			if(indexOfValue!=-1) list.get(indexOfValue).increment();
			else list.add(new Value(value));
		}
		
		int max=0, indexOfMax=list.size()-1;
		for(int i=list.size()-1; i>=0; i--){
			int counter=list.get(i).getCounter();
			if(counter>=max){
				max=counter;
				indexOfMax=i;
			}
		}
		return list.get(indexOfMax).getValue();
	}
	
	public static int find(ArrayList<Value> list, int target){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getValue()==target) return i;
		}
		return -1;
	}
}
