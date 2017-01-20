/*	lecture 12 lab, AP Computer Science
 * 
 *  Copyright (C) 2017  Robert Ciliberto
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