package lecture_20_alternative;
import java.util.ArrayList;

public class TestTester {
	public static void main(String[] args){
		MultipleChoice q1=new MultipleChoice("Who is the first president of the united States?", "George Washington");
		q1.addChoice("George Washington");
		q1.addChoice(0, "Abraham Lincoln");
		q1.addChoice("Franklin Roosevelt");
		q1.addChoice("George H. W. Bush");
		
		Question q2=new Question("What is my name?", "Robby");
		
		Question q3=new Question("Who is the teacher?","Dr. Nguyen");
		
		MultipleChoice q4=new MultipleChoice("What language is this?","Java");
		q4.addChoice("Java");
		q4.addChoice("Python");
		q4.addChoice("C++");
		q4.addChoice("HTML");
		
		
		
		ArrayList<Question> testQuestions=new ArrayList<Question>();
		testQuestions.add(q1);
		testQuestions.add(q2);
		testQuestions.add(q3);
		testQuestions.add(q4);
		
		
		
		Test test=new Test(testQuestions);
		test.scrambleTest();
		test.printTest();
		System.out.println();
		System.out.println("Answers:");
		test.printAnswers();
	}
}
