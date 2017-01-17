package lecture_11;
import static java.lang.System.out;

public class ComplexDriver {
  public static void main(String[] args){
    //Test Constructors
    MyComplex a = new MyComplex();
    MyComplex b = new MyComplex(4,2);
    MyComplex c = new MyComplex(5,4);
    
    //Test toString()
    out.println("a is " + a);
    out.println("b is " + b);
    out.println("c is " + c);
    
    out.println();
    
    //Test Accessors & Mutators
    b.setReal(3);
    b.setImg(4);
    out.println("Complex b (a+bi):");
    out.println("a is " + b.getReal());
    out.println("b is " + b.getImg());
    
    out.println();
    
    //Test isReal()
    out.println("Is a real: " + a.isReal());
    out.println("Is b real: " + b.isReal());
    
    out.println();
    
    //Test isImaginary()
    out.println("Is a imaginary: " + a.isImaginary());
    out.println("Is b imaginary: " + b.isImaginary());
    
    out.println();
    
    //Test add()
    out.println("c=c+b:");
    c.add(b);
    out.println("c is now " + c);
    
    out.println();
    
    //Test Multiply()
    out.println("c=c*b");
    c.multiply(b);
    out.println("c is now " + c);
    
    out.println();
    
    //Test conjugate()
    out.println("Conjugate of c:");
    c.conjugate();
    out.println("c is now " + c);
    
    out.println();
    
    //Test argument()
    out.println("Argument of c:" + c.argument());
    
    out.println();
    
    //Test magnitude()
    out.println("Magnitude of c: " + c.magnitude());
    
    out.println();
    
    //Test addNew()
    out.println("Sum of a and b: " + MyComplex.addNew(a,b));
    out.println("Sum of a and c: " + MyComplex.addNew(a,c));
    out.println("Sum of b and c: " + MyComplex.addNew(b,c));
    
    out.println();
    
    //Test multiplyNew()
    out.println("Product of a and b: " + MyComplex.multiplyNew(a,b));
    out.println("Product of a and c: " + MyComplex.multiplyNew(a,c));
    out.println("Product of b and c: " + MyComplex.multiplyNew(b,c));
  }
}