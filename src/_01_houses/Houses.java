package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robot = new Robot();

	
	public void setUp(){

		robot.penDown();
		robot.setPenColor(0,255,0);
		robot.miniaturize();
		robot.setSpeed(50);
		
			
	}
	public void runProgram(){
		for (int i = 0; i < 10; i++) {
			drawLargeHouse();
			robot.turn(-90);
			robot.setPenColor(0,255,0);
			robot.move(20);
			robot.turn(-90);
		}
		
	}
	private void drawBuiding() {
	String input = JOptionPane.showInputDialog("Would you like a small, medium or large building?");
	
	if(input.equalsIgnoreCase("small")) {
		drawSmallHouse();
	}
	
	else if(input.equalsIgnoreCase("medium")) {
		drawMediumHouse();
	}
	else {
		drawLargeHouse();
	}
		
	}

	public static void drawLargeHouse() {
		
		robot.move(100);
		robot.turn(90);
		robot.move(20);
		robot.turn(90);
		robot.move(100);
	
	
}
public static void drawMediumHouse() {
		
		robot.move(75);
		robot.turn(90);
		robot.move(20);
		robot.turn(90);
		robot.move(75);
}
public static void drawSmallHouse() {
	
	robot.move(50);
	robot.turn(90);
	robot.move(20);
	robot.turn(90);
	robot.move(50);
}
}
