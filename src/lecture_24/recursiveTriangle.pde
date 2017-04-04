void setup(){
  size(720,720);
}

void draw(){
  background(255);
  fractalTriangle(1,height,width,height,width/2,1,7);
}

void fractalTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int n){
  if(n==1){
    fill(0,255,0);
    triangle(x1,y1,x2,y2,x3,y3);
  }
  else{
    fill(0);
    triangle(x1,y1,x2,y2,x3,y3);
    
    int midP1x=(x1+x2)/2, midP1y=(y1+y2)/2;
    int midP2x=(x2+x3)/2, midP2y=(y2+y3)/2;
    int midP3x=(x1+x3)/2, midP3y=(y1+y3)/2;
    
    fractalTriangle(x1,y1,midP1x,midP1y,midP3x,midP3y,n-1);
    fractalTriangle(midP1x,midP1y,x2,y2,midP2x,midP2y,n-1);
    fractalTriangle(midP3x,midP3y,midP2x,midP2y,x3,y3,n-1);
  }
}