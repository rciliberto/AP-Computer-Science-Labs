package lecture_12;
import java.util.*;
import static java.lang.System.*;

public class Lab1 {
  public static void main(String[] args){
    Scanner input = new Scanner(in);
    
    out.print("How many days' temperatures?: ");
    int[] days = new int[input.nextInt()];
    out.println();
    
    for (int i=0; i<days.length; i++){
      out.print("Day " + (1+i) + "'s high temp (integer): ");
      days[i]=input.nextInt();
      out.println();
    }
    
    int sum=0;
    for (int i=0; i<days.length; i++){
      sum+=days[i];
    }
    
    double avg=(double)sum/days.length;
    out.println("Average temp = " + avg);
    
    int count=0;
    for (int i=0; i<days.length; i++){
      if (days[i]>avg) count++;
    }
    out.println(count + " days were above the average.");
  }    
}