void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    //ellipse(150, 200, 150, 150);
   fill(206,168,106);
    ellipse(mouseX, mouseY, 300,150);
    //rect(176, 103, 12, 32);
fill(237,200,139);
ellipse(mouseX+100,mouseY,150,150);
   fill(0,0,0);
    ellipse(mouseX+65, mouseY, 25,25);
    ellipse(mouseX+165, mouseY, 25,25);
if(mousePressed){
 fill(200,200,200);
ellipse(mouseX+100,mouseY-50,75,75);
  fill(200,200,200);
ellipse(mouseX,mouseY+50,75,75);
    fill(200,200,200);
ellipse(mouseX-125,mouseY,75,75);
    fill(0,0,0);
  ellipse(mouseX+120, mouseY+30, 35,35);
}
}
