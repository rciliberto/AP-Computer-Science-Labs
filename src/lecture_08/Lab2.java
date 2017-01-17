package lecture_08;
import static java.lang.System.*;

public class Lab2 {
	public static void main(String[] args){
		parseAddress("123 Adams st Dorchester, MA 02122");
		parseAddress("253 Market st Brighton, MA 02135");
	}
	
	public static void parseAddress(String str){
		String info=str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		out.println("Number: " + info);
		
		info=str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		info += " " + str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		out.println("Street: " + info);
		
		info=str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		info += " " + str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		out.println("City/State: " + info);
		
		out.println("Zip code: " + str);
		out.println();
	}
}
