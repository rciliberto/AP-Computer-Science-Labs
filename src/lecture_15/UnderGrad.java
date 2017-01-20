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
public class UnderGrad extends Student{
	/****************
	 * Constructors *
	 ****************/
	public UnderGrad(String name, int[] tests, String grade){
		super(name, tests, grade);
	}
	
	public UnderGrad(){
		super();
	}
	
	
	
	/********************
	 * Instance Methods *
	 ********************/
	@Override
	public void computeGrade(){
		if(getTestAverage()>=75) setGrade("pass");
		else setGrade("fail");
	}
}
