/*	lecture 11 lab, AP Computer Science
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
package lecture_11;

public class Student {
	private String name, address, mathClass;
	private int id;
	private double gpa;
	
	/******************
	 ** Constructors **
	 ******************/
	public Student(String name, String address, int id, double gpa, String mathClass){
		this.name=name;
		this.address=address;
		this.id=id;
		this.gpa=gpa;
		this.mathClass=mathClass;
	}
	
	public Student(){
		this("John Doe", "", 0, 0.0, "");
	}
	
	public Student(String name, int id){
		this(name, "", id, 0.0, "");
	}
	
	public Student(String name){
		this(name, "", 0, 0.0, "");
	}
	
	
	/*************
	 ** Methods **
	 *************/
	public String toString(){
		return name + " (" + id + ")";
	}
	
	public void updateGPA(double gpa){
		this.gpa=gpa;
	}
	
	public String graduationStatus(){
		if (gpa<1) return "not graduating";
		return "graduating";
	}
	
	public void changeMathClass(String mathClass){
		this.mathClass=mathClass;
	}
}
