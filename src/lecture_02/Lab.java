package lecture_02;

public class Lab {
	public static void main(String args[]){
		int test1, test2, test3;
		double avg, dev1, dev2, dev3, var, stdev;
		
		test1=78;
		test2=82;
		test3=89;
		
		avg=(test1+test2+test3)/3.0;
		
		dev1=test1-avg;
		dev2=test2-avg;
		dev3=test3-avg;
		
		var=(dev1*dev1+dev2*dev2+dev3*dev3)/3.0;
		
		stdev=Math.sqrt(var);
		
		System.out.println("The test Scores are: " + test1 + ", " + test2 + ", " + test3 + ".");
		System.out.println("The average of the scores is: " + avg);
		System.out.println("The variance is: " + var);
		System.out.println("The standard deviation is: " + stdev);
	}
}
