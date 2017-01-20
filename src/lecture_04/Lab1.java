package lecture_04;

public class Lab1 {
	public static void main(String[] args){
		double height=70;	//Store height (in inches) in a double
		double weight=194.25;	//Store weight (in pounds) in a double
		
		System.out.println("Height (in inches): " + height);
		System.out.println("Weight (in pounds): " + weight);
		System.out.println("BMI = " + bmi(height,weight));
		System.out.println(weightClass(height,weight));
	}
	
	public static double bmi(double height, double weight){	//Accepts a double for height in inches and weight in pounds
		return 703*(weight/Math.pow(height,2));	//Return the BMI (703*(weight/height^2))
	}
	
	public static String weightClass(double height, double weight){	//Accepts a double for height in inches and weight in pounds
		double bmi=bmi(height,weight);	//Store BMI in a double
		if(bmi>=30)	return "obese";	//Check if obese and return if so
		if(bmi>=25) return "overweight";	//Check if overweight and return if so
		if(bmi>=18.5) return "normal";	//Check if normal and return if so
		return "underweight";	//Otherwise return "underweight"
	}
}
