package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(in);
		
		out.print("Enter a sentence: ");
		String str=input.nextLine();
		out.println("There are " + countSpaces(str) + " spaces");
		input.close();
	}
	
	public static int countSpaces(String str){
		int count=0;
		
		for (int i=0; i<str.length(); i++){
			if (str.charAt(i)==' ') count++;
		}
		
		return count;
	}
}
