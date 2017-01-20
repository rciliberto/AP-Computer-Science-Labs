package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args){
		Scanner input = new Scanner(in);	//Declare and initialize new Scanner object
		
		out.print("Enter a word: ");	//Print instructions
		String str=input.nextLine();	//Get user input
		out.println(oddEven(str));		//Print separated input
		input.close();	//Close scanner
	}
	
	public static String oddEven(String str){	//Accepts a String
		String even="", odd="";	//Declare and initialize placeholder Strings
		
		for (int i=0; i<str.length(); i++){	//Cycle through the indexes of the String
			if (i%2==0) even += str.substring(i,i+1);	//Determine if the index is even and if so add it to the placeholder
			else odd += str.substring(i,i+1);	//Determine if the index is odd and if so add it to the placeholder
		}
		
		return even + " " + odd;	//Return the evens and the odds separated by a space
	}
}
