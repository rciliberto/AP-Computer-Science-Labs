package lecture_15;
public class GradStudent extends Student{
	private int gradID;
	
	
	
	/****************
	 * Constructors *
	 ****************/
	public GradStudent(String name, int[] tests, String grade, int gradID){
		super(name, tests, grade);
		this.gradID=gradID;
	}
	
	public GradStudent(){
		super();
		gradID=0;
	}
	
	
	
	/*************
	 * Accessors *
	 *************/
	public int getID(){
		return gradID;
	}
	
	
	
	/********************
	 * Instance Methods *
	 ********************/
	@Override
	public void computeGrade(){
		super.computeGrade();
		if(getTestAverage()>=90) setGrade("Pass with distinction");
	}
}
