package lecture_07;

public class ExtractDigits {
	public static void main(String[] args){
		System.out.print(sumDigits(124));
	}
	
	public static int sumDigits(int n){
		int sum=0;
		while(n>0){
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
}
