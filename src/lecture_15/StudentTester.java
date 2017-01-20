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
public class StudentTester{
  public static void main(String[] args){
    Student s1=new Student();
    int[] test={65,55,52};
    Student s2=new Student("Mike Smith",test,"");
    s2.computeGrade();
    Student s3=new UnderGrad();
    Student s4=new GradStudent();
    //UnderGrad s5=new Student();//  error
    //UnderGrad s6=new GradStudent();//error
    //GradStudent s7=new UnderGrad();//error
    
    s4.computeGrade(); //which one? GradStudent
    s3.computeGrade(); //which one? UnderGrad
    s1.computeGrade(); //which one? Student
  }
}