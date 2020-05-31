package _08_robot_in_space;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class hhehwfefnjenjergojgiegekvmldm {
public static void main(String[] args) {
	
	Robot a = new Robot();
	Robot b = new Robot();
	Robot c = new Robot();
	
	
	String input =JOptionPane.showInputDialog(null, "what is your favorite color");


if(input.equals("blue")){
a.setPenColor(0, 0, 255);
a.setWindowColor(0, 0, 255);
}

if(input.equals("red")){
b.setPenColor(255, 0, 0);
b.setWindowColor(255, 0, 0);
}

if(input.equals("green")){
c.setPenColor(0, 255, 0);
c.setWindowColor(0, 255, 0);
}

a.setSpeed(100);	
b.setSpeed(100);	
c.setSpeed(100);	
	a.miniaturize();
	b.miniaturize();
	c.miniaturize();
	
	b.turn(90);
	c.turn(270);
	b.move(50);
	c.move(50);
	a.penDown();
	b.penDown();
	c.penDown();
	
	
	a.move(25);
	a.turn(90);
	a.move(25);
	a.turn(90);
	a.move(25);
	a.turn(90);
	a.move(25);
	a.turn(90);
	b.move(25);
	b.turn(-90);
	b.move(25);
	b.turn(-90);
	b.move(25);
	b.turn(-90);
	b.move(25);
	b.turn(-90);
	c.move(25);
	c.turn(90);
	c.move(25);
	c.turn(90);
	c.move(25);
	c.turn(90);
	c.move(25);
	c.turn(90);

	
}
}
