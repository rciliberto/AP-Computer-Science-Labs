package lecture_15;
public class UnderGrad extends Student{
	/****************
	 * Constructors *
	 ****************/
	public UnderGrad(String name, int[] tests, String grade){
		super(name, tests, grade);
	}
	
	public UnderGrad(){
		super();
	}
	
	
	
	/********************
	 * Instance Methods *
	 ********************/
	@Override
	public void computeGrade(){
		if(getTestAverage()>=75) setGrade("pass");
		else setGrade("fail");
	}
}
