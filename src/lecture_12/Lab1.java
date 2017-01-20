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