/* 	lecture 15 lab, AP Computer Science
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
package lecture_15;
public class GradStudent extends Student{
	private int gradID;
	
	
	
	/****************
	 * Constructors *
	 ****************/
	public GradStudent(String name, int[] tests, String grade, int gradID){
		super(name, tests, grade);
		this.gradID=gradID;
	}
	
	public GradStudent(){
		super();
		gradID=0;
	}
	
	
	
	/*************
	 * Accessors *
	 *************/
	public int getID(){
		return gradID;
	}
	
	
	
	/********************
	 * Instance Methods *
	 ********************/
	@Override
	public void computeGrade(){
		super.computeGrade();
		if(getTestAverage()>=90) setGrade("Pass with distinction");
	}
}
