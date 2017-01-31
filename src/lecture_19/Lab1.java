package lecture_19;
import java.util.ArrayList;

public class Lab1 {
	public static int smallest(ArrayList<Integer> array){
		int smallest=array.get(0);
		
		for(int i=0; i<array.size(); i++){
			if(smallest>array.get(i)) smallest=array.get(i);
		}
		
		return smallest;
	}
	
	public static String longest(ArrayList<String> array){
		int indexOfLongest=0;
		
		for(int i=array.size(); i>=0; i--){
			if(array.get(indexOfLongest).length()<=array.get(i).length()) indexOfLongest=i;
		}
		
		return array.get(indexOfLongest);
	}
	
	public static void remove(ArrayList<Double> array, double x){
		while(array.indexOf(x)!=-1){
			array.remove(array.indexOf(x));
		}
	}
}
