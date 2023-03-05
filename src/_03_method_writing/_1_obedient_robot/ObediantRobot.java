package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	
	rob.setX(350);
	rob.setY(400);
	rob.penDown();
	JOptionPane.showInputDialog("What shape do you want?");
	if
	drawSquare();
	drawTriangle();
	drawCircle();
	
}
public static void drawSquare() {
	for(int i = 0; i < 4; i++) {
		rob.move(140);
		rob.turn(90);
	}
}
public static void drawTriangle() {
	rob.setX(350);
	rob.setY(200);
	for(int i = 0; i < 3; i++) {
		rob.turn(120);
		rob.move(140);
		
	}
}
	
public static void drawCircle() {
	rob.setX(350);
	rob.setY(450);
	for(int i = 0; i < 360; i++) {
		rob.move(1);
		rob.turn(1);
	}
}
}
