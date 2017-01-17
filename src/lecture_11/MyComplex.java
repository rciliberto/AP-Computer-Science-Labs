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