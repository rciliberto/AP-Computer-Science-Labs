package lecture_15;
public class StudentTester{
  public static void main(String[] args){
    Student s1=new Student();
    int[] test={65,55,52};
    Student s2=new Student("Mike Smith",test,"");
    s2.computeGrade();
    Student s3=new UnderGrad();
    Student s4=new GradStudent();
    //UnderGrad s5=new Student();//  error
    //UnderGrad s6=new GradStudent();//error
    //GradStudent s7=new UnderGrad();//error
    
    s4.computeGrade(); //which one? GradStudent
    s3.computeGrade(); //which one? UnderGrad
    s1.computeGrade(); //which one? Student
  }
}