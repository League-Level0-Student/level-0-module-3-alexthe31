package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String input;
		input = JOptionPane.showInputDialog("Are you happy?");

		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
		} else if (input.equals("no")) {

			input = JOptionPane.showInputDialog("Do you want to be happy?");

			if (input.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change something");
			} else {
				JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
			}
		}
	}
}