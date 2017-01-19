package lecture_02;

public class Lab {
	public static void main(String args[]){
		int test1, test2, test3; //Declare integers for the test scores
		double avg, dev1, dev2, dev3, var, stdev; //Declare doubles for calculations
		
		test1=78; //Test score variables stored as integers
		test2=82;
		test3=89;
		
		avg=(double)((test1+test2+test3)/3); //Calculate the average and store it in a double
		
		dev1=test1-avg; //Calculate the deviations from the average per test score and store them in doubles
		dev2=test2-avg;
		dev3=test3-avg;
		
		var=(dev1*dev1+dev2*dev2+dev3*dev3)/3; //Calculate the variance of the test scores and store it in a double
		
		stdev=Math.sqrt(var); //Calculate the standard deviation of the data and store it in a double
		
		System.out.println("The test Scores are: " + test1 + ", " + test2 + ", " + test3 + "."); //Print the scores
		System.out.println("The average of the scores is: " + avg); //Print the average
		System.out.println("The variance is: " + var); //Print the variance
		System.out.println("The standard deviation is: " + stdev); //Print the standard deviation
	}
}
