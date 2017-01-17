package lecture_12;
import java.util.*;
import static java.lang.System.*;

public class Lab2{
  public static void main(String[] args){
    Scanner input = new Scanner(in);
    
    while (true){    
      out.print("How many days' temperatures?: ");
      int[] temps = new int[input.nextInt()];
      out.println();
      
      for (int i=0; i<temps.length; i++){
        out.print("Day " + (i+1) + "'s high temp (integer): ");
        temps[i]=input.nextInt();
        out.println();
      }
      
      out.println("Average temperature: " + average(temps));
      out.println(countAboveAve(temps) + " days were above the average.");
      out.println("Temperatures: " + Arrays.toString(temps));
      out.println("Coldest temperature: " + smallest(temps));
      out.println("hottest temperature: " + largest(temps));
      
      out.println();
      out.println("Enter another? (Y/N): ");
      String ans;
      ans = input.nextLine();
      ans = input.nextLine();
      if (ans.toUpperCase().equals("N")) break;
      out.println();
      out.println();
    }
    input.close();
  }
  
  public static double average(int[] a){
    int sum=0;
    for (int i=0; i<a.length; i++){
      sum+=a[i];
    }
    
    return (double)sum/a.length;
  }
  
  public static int countAboveAve(int[] a){
    int count=0;
    for (int i=0; i<a.length; i++){
      if (a[i]>average(a)) count++;
    }
    return count;
  }
  
  public static int largest(int[] a){
    int largest=a[0];
    for (int i=0; i<a.length; i++){
      if (a[i]>largest) largest=a[i];
    }
    
    return largest;
  }
  
  public static int smallest(int[] a){
    int smallest=a[0];
    for (int i=0; i<a.length; i++){
      if (a[i]<smallest) smallest=a[i];
    }
    
    return smallest;
  }
}