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
	
    // Save variables, initialize list
	public Question(String question, boolean choice, String correctAnswer) {
		this.question = question;
		isMultipleChoice = choice;
		this.correctAnswer = correctAnswer;
		answers = new ArrayList<String>();
	}
	
	public boolean addChoice(String choice) {
		return addChoice(answers.size(), choice); // Add the choice to the end of list answers
	}
	
	public boolean addChoice(int index, String choice) {
		if (!isMultipleChoice) return false; // Automatically return false if not a multiple choice question
		if (answers.size() == 5) return false; // If there are already 5 answers, return false
		
		answers.add(i, choice); // Add the answer to position i
		return true;
	}
	
	public String toString() {
		if (!isMultipleChoice) return question + "\nAnswer: "; // If not multiple choice, just return the question and a line for the answer
		String response = question + "\n"; // The question, followed by a new line
		for (int i = 0; i < answers.size(); i++) { // Iterate through all answers in the list
			response += LETTERS[i] + " " + answers.get(i) + "\n"; // Add the answer to the string, with the appropriate letter before and a new line after
		}
		return response;
	}
	
	public void printAnswer() {
		if (!isMultipleChoice) { // If not multiple choice, just print the answer and end.
			System.out.println("Answer: " + correctAnswer);
			return; // End. An if/else statement can also be used
		}
		for (int i = 0; i < answers.size(); i++) { // Iterate through all answers in the list
			if (answers.get(i).equals(correctAnswer)) { // If the answer is equal to the correct answer...
				System.out.println("Answer: " + LETTERS[i] + " " + correctAnswer); // Print the answer with the appropriate letter...
				return; // and end (don't continue searching for the correct answer, because we already found it.)
			}
		}
	}
}
