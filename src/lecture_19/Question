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
