package lecture_19;

import java.util.*;

public class QuestionDriver {
  public static void main(String[] args) {
    Question question = new Question("Who is the first president of the United States?", true, "George Washington");
    question.addChoice("Abraham Lincoln");
    question.addChoice("Franklin Roosevelt");
    question.addChoice(1, "George Washington");
    System.out.println(question);
    question.printAnswer();
    
    Question question2 = new Question("5x+12 = 17\nx=?", false, "1");
    question2.addChoice("2");
    System.out.println(question2);
    question2.printAnswer();
  }
}
