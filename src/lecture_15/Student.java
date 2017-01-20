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
public class Student{
	private String name, grade;
	private int[] tests;
	
	public static final int NUM_TESTS=3;
	
	
	
	/****************
	 * Constructors *
	 ****************/
	public Student(String name, int[] tests, String grade){
		this.name=name;
		this.tests=tests;
		this.grade=grade;
	}
	
	public Student(){
		this("", new int[NUM_TESTS], "");
	}
	
	
	
	/*************
	 * Accessors *
	 *************/
	public String getName(){
		return name;
	}
	
	public String getGrade(){
		return grade;
	}
	
	
	
	/************
	 * Mutators *
	 ************/
	public void setGrade(String grade){
		this.grade=grade;
	}
	
	
	
	/********************
	 * Instance Methods *
	 ********************/
	public double getTestAverage(){
		int sum=0;
		for (int i=0; i<tests.length; i++){
			sum+=tests[i];
		}
		
		return (double)(sum/tests.length);
	}
	
	public void computeGrade(){
		if(getTestAverage()>=65) setGrade("pass");
		else setGrade("fail");
	}
}