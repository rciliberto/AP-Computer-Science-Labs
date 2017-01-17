package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args){
		Scanner input = new Scanner(in);
		
		out.print("Enter a sentence: ");
		String str=input.nextLine();
		
		int count=0;
		for (int i=0; i<str.length();i++){
			if (isVowel(str.charAt(i))) count++; 
		}
		out.println("There are " + count + " vowels.");
		input.close();
	}
	
	public static boolean isVowel(char str){
		if (str=='a' | str=='e' | str=='i' | str=='o' | str=='u') return true;
		return false;
	}
}
