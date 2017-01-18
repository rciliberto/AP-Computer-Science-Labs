package lecture_03;

public class lab {
	public static void main(String[] args){
		printMath(8,9,2,4);
	}
	
	public static double average(int x, int y){
		return (x+y)/2.0;
	}
	
	public static int difference(int x, int y){
		return Math.abs((x-y));
	}
	
	public static int square(int x){
		return x*x;
	}
	
	public static double slope(int x1, int y1, int x2, int y2){
		return (double)(y1-y2)/(x1-x2);
	}
	
	public static double distance(int x1, int y1, int x2, int y2){
		return Math.sqrt(square(difference(x1,x2))+square(difference(y1,y2)));
	}
	
	public static void printMath(int x, int y, int a, int b){
		System.out.println("The average of " + " is " + average(x,y));
		System.out.println("The slope of the line between ("+x+","+y+") and ("+a+","+ b+") is " + slope(x,y,a,b));
		System.out.println("The distance between ("+x+","+y+") and ("+a+","+ b+") is " + distance(x,y,a,b));
	}
}
