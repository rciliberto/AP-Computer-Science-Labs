package lecture_09;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args){
		Scanner input = new Scanner(in);
		
		out.print("Enter a sentence: ");
		String str=input.nextLine();
		out.println(oddEven(str));
		input.close();
	}
	
	public static String oddEven(String str){
		String even="", odd="";
		
		for (int i=0; i<str.length(); i++){
			if (i%2==0) even += str.substring(i,i+1);
			else odd += str.substring(i,i+1);
		}
		
		return even + " " + odd;
	}
}
