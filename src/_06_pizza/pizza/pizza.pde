
int x=0;
int y=0;
PImage doge;
void setup() {
 doge = loadImage("DOGEEEEEEE.jpg");
 doge.resize(width,height);
  size(1900, 1010);
  background(doge);
  fill(#521D17);
  ellipse (800,500,750,750); 
 fill(#F2FC66);
 ellipse (800,500,650,650); 
}
void draw() {

doge = loadImage("DOGEEEEEEE.jpg");
doge.resize(50, 50);
if(mousePressed){
x= mouseX;
y=mouseY;
  }
  image(doge, x,y);
}
