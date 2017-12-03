
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot acircle = new Robot("batman");
		String input;
		acircle.hide();
		acircle.setSpeed(10);
		acircle.penDown();
		for (int i = 0; i < 10; i++) {
			// 3. ask the user what color they would like the robot to draw
			input = JOptionPane.showInputDialog("what color");
			// 4. use an if/else statement to set the pen color that the user requested
			if (input.equals("blue")) {
				acircle.setPenColor(Color.BLUE);
			}

			if (input.equals("red")) {
				acircle.setPenColor(Color.RED);
			}
			if (input.equals("green")) {
				acircle.setPenColor(Color.GREEN);
			}
			if (input.equals("orange")) {
				acircle.setPenColor(Color.ORANGE);
			}
			if (input.equals("yellow")) {
				acircle.setPenColor(Color.yellow);
			}
			if (input.equals("white")) {
				acircle.setPenColor(Color.white);
			}
			for (int g = 0; g < 36; g++) {
				acircle.move(1);
				acircle.turn(1);
			}
		}
	}
}