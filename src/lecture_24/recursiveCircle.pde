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
  