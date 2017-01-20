/*	lecture 11 lab, AP Computer Science
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
package lecture_11;
public class MyComplex {
  /************
   ** Fields **
   ************/
  //Instance
  private double real, img;
  
  
  /******************
   ** Constructors **
   ******************/
  public MyComplex(double real, double img){
    this.real=real;
    this.img=img;
  }
  
  public MyComplex(){
    this(0,0);
  }
  
  
  /**************************
   ** Accessors & Mutators **
   **************************/
  //Accessors
  public double getReal(){
   return real;
  }
  
  public double getImg(){
   return img;
  }
  
  //Mutators
  public void setReal(double real){
    this.real=real;
  }
  
  public void setImg(double img){
    this.real=img;
  }
  
  
  /**********************
   ** Instance Methods **
   **********************/
  public String toString(){
    return real+"+"+img+"i";
  }
  
  public boolean isReal(){
    return img==0;
  }
  
  public boolean isImaginary(){
    return real==0;
  }
  
  public void add(MyComplex c){
    real+=c.real;
    img+=c.img;
  }
  
  public void multiply(MyComplex c){
    double real=this.real;
    double img=this.img;
    
    this.real=real*c.real-img*c.img;
    this.img=real*c.img+img*c.real;
  }
  
  public void conjugate(){
    img*=-1;
  }
  
  public double argument(){
    return Math.atan2(img, real);
  }
  
  public double magnitude(){
    return Math.sqrt(real*real+img*img);
  }
  
  
  /********************
   ** Static Methods **
   ********************/
  public static MyComplex addNew(MyComplex a, MyComplex b){
    MyComplex out = new MyComplex(a.real, a.img);
    out.add(b);
    return out;
  }
  
  public static MyComplex multiplyNew(MyComplex a, MyComplex b){
    MyComplex out = new MyComplex(a.real, a.img);
    out.multiply(b);
    return out;
  }
}