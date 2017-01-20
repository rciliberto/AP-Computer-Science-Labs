package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(in);	//Declare and initialize 
		
		out.print("Enter a sentence: ");	//Print instructions
		String str=input.nextLine();	//Get user input
		out.println("There are " + countSpaces(str) + " spaces");	//Print the number of spaces
		input.close();	//Close scanner
	}
	
	public static int countSpaces(String str){	//Accepts a String
		int count=0;	//Store the number of spaces in an integer
		
		for (int i=0; i<str.length(); i++){	//Cycle through the indexes of the String
			if (str.charAt(i)==' ') count++;	//If the character at index i is a space, increment the count
		}
		
		return count;	//Return the count
	}
}
