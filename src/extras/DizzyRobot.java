//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot a45 = new Robot();

	public static void main(String[] args) {
		a45.setSpeed(10);
		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number
		// of times.
		String input = JOptionPane.showInputDialog("how dizzy 1-10");
		int num = Integer.parseInt(input);
		// 1. Use the dance method to make the robot spin.
		dance(num);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			a45.turn(360);
		}
	}
}
