package lecture_13;
import java.util.Arrays;

public class Lab13 {
	public static void main(String[] args){
		int[] a1 = {12, 34, 56};
		int[] a2 = {20, 50, 80};
		swapAll(a1, a2);
		System.out.println(Arrays.toString(a1));  // [20, 50, 80]
		System.out.println(Arrays.toString(a2));  // [12, 34, 56]
	}
	
	public static int computeOdd(int[] arr){
		int sum=0; 
		for (int i=0; i<arr.length; i++){
			if(arr[i]%2==1) sum+=arr[i];
		}
		
		return sum;
	}
	
	public static void swapAll(int[] arr1, int[] arr2){
		int[] arr=Arrays.copyOf(arr1, arr1.length);
		for(int i=0; i<arr1.length; i++){
			arr1[i]=arr2[i];
		}
		
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr[i];
		}
	}
	
	public static int[] merge(int[] arr1, int[] arr2){
		int[] out= new int[arr1.length+arr2.length];
		
		for (int i=0; i<arr1.length; i++){
			out[i]=arr1[i];
		}
		
		for (int i=arr1.length; i<arr2.length; i++){
			out[i]=arr2[i];
		}
		
		return out;
	}
}
