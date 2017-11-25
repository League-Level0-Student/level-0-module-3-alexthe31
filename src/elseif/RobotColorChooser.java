
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot a = new Robot("batman");
		String input;
		for (int i = 0; i < 10; i++) {
			// 3. ask the user what color they would like the robot to draw
			input = JOptionPane.showInputDialog("what color");
			// 4. use an if/else statement to set the pen color that the user requested
			if (input.equals("blue")) {
				a.setPenColor(Color.BLUE);
			}
			if (input.equals("red")) {
				a.setPenColor(Color.RED);
			}
			if (input.equals("green")) {
				a.setPenColor(Color.GREEN);
			}
			if (input.equals("orange")) {
				a.setPenColor(Color.ORANGE);
			}
			if (input.equals("yellow")) {
				a.setPenColor(Color.yellow);
			}
			a.setSpeed(10);
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. set the pen width to 10
			a.setPenWidth(10);
			// 1. make the robot draw a shape (this will take more than one line of code)
			a.penDown();
			a.move(50);
			a.turn(45);
			a.penUp();
			a.move(120);

			{

			}

		}
	}
}
