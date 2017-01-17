package lecture_15;
public class Student{
	private String name, grade;
	private int[] tests;
	
	public static final int NUM_TESTS=3;
	
	
	
	/****************
	 * Constructors *
	 ****************/
	public Student(String name, int[] tests, String grade){
		this.name=name;
		this.tests=tests;
		this.grade=grade;
	}
	
	public Student(){
		this("", new int[NUM_TESTS], "");
	}
	
	
	
	/*************
	 * Accessors *
	 *************/
	public String getName(){
		return name;
	}
	
	public String getGrade(){
		return grade;
	}
	
	
	
	/************
	 * Mutators *
	 ************/
	public void setGrade(String grade){
		this.grade=grade;
	}
	
	
	
	/********************
	 * Instance Methods *
	 ********************/
	public double getTestAverage(){
		int sum=0;
		for (int i=0; i<tests.length; i++){
			sum+=tests[i];
		}
		
		return (double)(sum/tests.length);
	}
	
	public void computeGrade(){
		if(getTestAverage()>=65) setGrade("pass");
		else setGrade("fail");
	}
}