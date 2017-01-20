package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args){
		Scanner input = new Scanner(in); //Declare and initialize new Scanner object
		
		out.print("Enter a sentence: "); //Get input from user and store in a String
		String str=input.nextLine(); 
		
		int count=0;
		for (int i=0; i<str.length();i++){ //loop through indexes of input and count number of vowels using isVowel method
			if (isVowel(str.charAt(i))) count++; 
		}
		out.println("There are " + count + " vowels."); //Print number of vowels
		input.close(); //Close scanner object
	}
	
	public static boolean isVowel(char str){
		return (str=='a' | str=='e' | str=='i' | str=='o' | str=='u'); //Checks if the given char is a vowel
	}
}
