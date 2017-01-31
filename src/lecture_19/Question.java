/*
 * 	Lecture 19 Lab 2, AP Computer Science
 * 
 *  Copyright (C) 2017  David Shen
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

package lecture_19;

import java.util.*;

public class Question {
	public static final String[] LETTERS = {"A.", "B.", "C.", "D.", "E."};
	
	private String question;
	private boolean isMultipleChoice;
	private String correctAnswer;
	private ArrayList<String> answers;
	
	public Question(String question, boolean choice, String correctAnswer) {
		this.question = question;
		isMultipleChoice = choice;
		this.correctAnswer = correctAnswer;
		answers = new ArrayList<String>();
	}
	
	public boolean addChoice(String choice) {
		return addChoice(answers.size(), choice);
	}
	
	public boolean addChoice(int index, String choice) {
		if (!isMultipleChoice) return false;
		if (answers.size() == 5) return false;
		
		answers.add(i, choice);
		return true;
	}
	
	public String toString() {
		if (!isMultipleChoice) return question + "\nAnswer: ";
		String response = question + "\n";
		for (int i = 0; i < answers.size(); i++) {
			response += LETTERS[i] + " " + answers.get(i) + "\n";
		}
	}
	
	public void printAnswer() {
		if (!isMultipleChoice) {
			System.out.println("Answer: " + answer);
			return;
		}
		for (int i = 0; i < answers.size(); i++) {
			if (answers.get(i).equals(answer)) {
				System.out.println("Answer: " + LETTERS[i] + " " + answer);
				return;
			}
		}
	}
}
