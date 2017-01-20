/*	lecture 8 lab, AP Computer Science
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
package lecture_08;
import static java.lang.System.*;

public class Lab2 {
	public static void main(String[] args){
		parseAddress("123 Adams st Dorchester, MA 02122");
		parseAddress("253 Market st Brighton, MA 02135");
	}
	
	public static void parseAddress(String str){
		String info=str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		out.println("Number: " + info);
		
		info=str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		info += " " + str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		out.println("Street: " + info);
		
		info=str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		info += " " + str.substring(0,str.indexOf(" "));
		str = str.substring(str.indexOf(" ")+1);
		out.println("City/State: " + info);
		
		out.println("Zip code: " + str);
		out.println();
	}
}
