package lecture_08;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args){
		Scanner input = new Scanner(in);
				
		out.print("What is your name: ");
		String name=input.nextLine();
		out.println();
		String first=name.substring(0,name.indexOf(" ")), last=name.substring(name.indexOf(" ")+1);
		out.println("Your gangster name is " + name.substring(0,1) + ". Diddy " + last.toUpperCase() + " " + first + "-izzle");
		input.close();
	}
}
