/* 	Lecture 20 Lab 3, AP Computer Science
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
package lecture_20_alternative;
import java.util.ArrayList;

public class Test {
	private ArrayList<Question> questions;
	private int[] points;
	
	public Test(ArrayList<Question> questions){
		this.questions=questions;
		setPoints(5,10);
	}
	
	
	public int totalPoints(){
		int count=0;
		
		for(int point : points){
			count+=point;
		}
		return count;
	}
	
	public void printTest(){
		for(int i=0; i<questions.size(); i++){
			System.out.print((i+1) + ". ");
			System.out.println(questions.get(i));
			System.out.println();
		}
	}
	
	public void printAnswers(){
		for(int i=0; i<questions.size(); i++){
			System.out.print((i+1) + ". ");
			questions.get(i).printAnswer();
			System.out.println();
		}
	}
	
	public void setPoints(int mcPoints, int shortPoints){
		points=new int[questions.size()];
		
		for(int i=0; i<questions.size(); i++){
			if(questions.get(i) instanceof MultipleChoice) points[i]=mcPoints;
			else points[i]=shortPoints;
		}
	}
	
	public boolean addChoice(int questionNumber, String choice){
		if(questions.get(questionNumber) instanceof MultipleChoice){
			((MultipleChoice) questions.get(questionNumber-1)).addChoice(choice);
			return true;
		}
		return false;		
	}
	
	public void scrambleTest(){
		//to be implemented
	}
}
