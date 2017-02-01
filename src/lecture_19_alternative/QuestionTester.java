/* 	Lecture 19 Lab 2, AP Computer Science
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
package lecture_19_alternative;

public class QuestionTester {
	public static void main(String[] args) {
		MultipleChoice q1=new MultipleChoice("Who is the first president of the united States?", "George Washington");
		
		q1.addChoice("George Washington");
		q1.addChoice(0, "Abraham Lincoln");
		q1.addChoice("Franklin Roosevelt");
		
		System.out.println(q1);
		/*	Who is the first president of the united States?
			A. Abraham Lincoln
			B. George Washington
			C. Franklin Roosevelt
		*/
		System.out.println();
		q1.printAnswer();	//B. George Washington
		System.out.println();
		
		Question q2=new Question("What is my name?", "Robby");
		System.out.println(q2);	//"What is my name?"
		q2.printAnswer();	//"Robby"
	}
}