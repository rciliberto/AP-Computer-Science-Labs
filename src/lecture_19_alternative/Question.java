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

public class Question {
	private String question, correctAnswer;
	
	public Question(String question, String correctAnswer){
		this.question=question;
		this.correctAnswer=correctAnswer;
	}
	
	public String toString(){	//Return the question (can be used to access the question String)
		return question;
	}
		
	public String Answer(){	//Return the answer (used for child-classes to access the correctAnswer String)
		return correctAnswer;
	}
	
	public void printAnswer(){	//Print out the answer
		System.out.println(correctAnswer);
	}
}
