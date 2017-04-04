package lecture_25;

public class lab1 {
	public static void main(String[] args){
		int[] sortedArray={0,1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(sortedArray, 10));
	}
	public static int binarySearch(int[] a, int target){
		int i=a.length/2;
		int chunk=a.length/4;
		while(true){
			if(!(i>=a.length || i<0)){
				if(a[i]==target) break;
				else if(a[i]<target){
					i+=chunk;
					chunk-=chunk/2;
				}else{
					i-=chunk;
					chunk-=chunk/2;
				}
			}
			else return -1;
		}
		return i+1; 
	}
}
