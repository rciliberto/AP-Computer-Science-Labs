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
import java.util.ArrayList;

public class MultipleChoice extends Question {
	ArrayList<String> answers;
	public static final String[] LETTERS={"A", "B", "C", "D", "E"};
	
	public MultipleChoice(String question, String correctAnswer){
		super(question, correctAnswer);
		answers=new ArrayList<String>();
	}
	
	public boolean addChoice(String choice){
		return addChoice(answers.size(), choice);
	}
	
	public boolean addChoice(int index, String choice){
		if(answers.size()>=5) return false;
		else{
			answers.add(index, choice);
			return true;
		}
	}
	
	@Override
	public String toString(){
		String choices="";
		for(int i=0; i<answers.size(); i++){
			choices+=LETTERS[i]+". "+answers.get(i)+"\n";
		}
		return super.toString() + "\n" + choices;
	}
	
	@Override
	public void printAnswer(){
		int letter=-1;
		for(int i=0; i<answers.size(); i++){
			if(answers.get(i).equals(Answer())) letter=i;
		}
		if(letter==-1) System.out.println("No correct answer.");
		else System.out.println(LETTERS[letter]+". "+answers.get(letter));
	}
}
