/*
 * 	Lecture 19 Lab 2, AP Computer Science
 * 
 *  Copyright (C) 2017  David Shen
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lecture_19;

import java.util.*;

public class QuestionDriver {
  public static void main(String[] args) {
    Question question = new Question("Who is the first president of the United States?", true, "George Washington");
    question.addChoice("Abraham Lincoln");
    System.out.println(question.addChoice("Franklin Roosevelt"));
    question.addChoice(1, "George Washington");
    System.out.println(question);
    question.printAnswer();
    
    Question question2 = new Question("5x+12 = 17\nx=?", false, "1");
    System.out.println(question2.addChoice("2"));
    System.out.println(question2);
    question2.printAnswer();
  }
}
