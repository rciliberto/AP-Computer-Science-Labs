package lecture_11;
public class Student {
	private String name, address, mathClass;
	private int id;
	private double gpa;
	
	/******************
	 ** Constructors **
	 ******************/
	public Student(String name, String address, int id, double gpa, String mathClass){
		this.name=name;
		this.address=address;
		this.id=id;
		this.gpa=gpa;
		this.mathClass=mathClass;
	}
	
	public Student(){
		this("John Doe", "", 0, 0.0, "");
	}
	
	public Student(String name, int id){
		this(name, "", id, 0.0, "");
	}
	
	public Student(String name){
		this(name, "", 0, 0.0, "");
	}
	
	
	/*************
	 ** Methods **
	 *************/
	public String toString(){
		return name + " (" + id + ")";
	}
	
	public void updateGPA(double gpa){
		this.gpa=gpa;
	}
	
	public String graduationStatus(){
		if (gpa<1) return "not graduating";
		return "graduating";
	}
	
	public void changeMathClass(String mathClass){
		this.mathClass=mathClass;
	}
}
