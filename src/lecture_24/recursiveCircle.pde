/* 	Lecture 24 Lab 1, AP Computer Science
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
void setup(){
  size(1080,720);
}

void draw(){
  background(255);
  noFill();
  //ellipse(width/2,height/2,width/2,width/2);
  circle(width/2,width/4,10);
}

void circle(int x, int radius, int depth){
  if(depth!=0){
    ellipse(x,height/2,2*radius,2*radius);
    circle(x+radius,radius/2,depth-1);
    circle(x-radius,radius/2,depth-1);
  }
}
  