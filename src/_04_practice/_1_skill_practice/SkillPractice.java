package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
}
	void skill1(){
String d = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(d);
int dCents = dimes*10;
JOptionPane.showMessageDialog(null, "You have " + dCents + " cents");

String height =JOptionPane.showInputDialog("How tall are you in inches?");
int height1 = Integer.parseInt(height);
if (height1 <= 36) {
	JOptionPane.showMessageDialog(null, "Eat your wheeties!");
}

}
	void skill2() {
	for(int i = 1; i<=30; i+= 3) {
		System.out.println(i);
	}
}
	void skill3() {
int random = new Random().nextInt(20)+1;
System.out.println(random);
int random1 = new Random().nextInt(10)+1;
System.out.println(random1);
JOptionPane.showMessageDialog(null, random -= random1);
}
	void skill4() {
String sand = JOptionPane.showInputDialog("What city do you live in?");
if (sand.equals("San Diego") ) {
	JOptionPane.showMessageDialog(null, "You live in Americas finest city!");
}
else {
JOptionPane.showMessageDialog(null, "Move to San Diego");	
}

int cars = 3 ;

if(cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportaion");
}
else if(cars == 1) {
	JOptionPane.showMessageDialog(null, "You probably drive a Honda civic");
}
else if(cars > 1) {
	int wheels = cars*4 ;
	JOptionPane.showMessageDialog(null, "You have " + wheels);
}
}
	void skill5() {
String School = JOptionPane.showInputDialog("What school do you go to?");
JOptionPane.showMessageDialog(null, School + " is a fantastic school!");
}
}
