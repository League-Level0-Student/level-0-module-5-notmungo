package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	
	rob.setX(350);
	rob.setY(400);
	rob.penDown();
	String s = JOptionPane.showInputDialog("What shape do you want?");
	String b = JOptionPane.showInputDialog("What color do you want? You can pick from blue, red, green");
	if (b.equals("red")) {
		rob.setPenColor(255,0,0) ;
	}
	else if (b.equals("blue")) {
		rob.setPenColor(0,0,255);
	}
	else if (b.equals("green")) {
		rob.setPenColor(0,255,0);
	}
    if (s.equals("circle")) {
    	drawCircle();
    }
    else if (s.equals("square")) {
    	drawSquare();
    }
    else if (s.equals("triangle")) {
    	drawTriangle();
    }
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
