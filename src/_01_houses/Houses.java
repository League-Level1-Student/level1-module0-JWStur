package _01_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robot = new Robot();

	public void setUp() {

		robot.penDown();
		robot.setPenColor(0, 255, 0);
		robot.miniaturize();
		robot.setSpeed(50);

	}

	public void runProgram() {
		for (int i = 0; i < 10; i++) {
			robot.setRandomPenColor();
			drawBuilding();
			//drawLargeHouse();
			
			
			robot.turn(-90);
			robot.setPenColor(0, 255, 0);
			robot.move(20);
			robot.turn(-90);
			
		}

	}

	private void drawBuilding() {
		String input = JOptionPane.showInputDialog("Would you like a small, medium or large building?");

		if (input.equalsIgnoreCase("small")) {
			drawSmallHouse();
		}

		else if (input.equalsIgnoreCase("medium")) {
			drawMediumHouse();
		} else {
			drawLargeHouse();
		}

	}

	public static void drawLargeHouse() {

		robot.move(100);
		drawRandomRoof();
		robot.move(100);

	}

	private static void drawRandomRoof() {
		Random roof = new Random();
		int value = roof.nextInt(2);
		
		if( value == 0) {
			drawPointyRoof();
		}
		else if( value == 1) {
			drawFlatRoof();
		}
		
	}

	private static void drawPointyRoof() {
		robot.turn(45);
		robot.move(10);
		robot.turn(90);
		robot.move(10);
		robot.turn(45);
		
	}

	private static void drawFlatRoof() {
		robot.turn(90);
		robot.move(20);
		robot.turn(90);
	}

	public static void drawMediumHouse() {

		robot.move(75);
		drawRandomRoof();
		robot.move(75);
	}

	public static void drawSmallHouse() {

		robot.move(50);
		drawRandomRoof();
		robot.move(50);
	}
}
