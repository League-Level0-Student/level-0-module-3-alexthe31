
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "june 4th";
		String dadsBirthday = "september 4";
		String myBirthday = "August 26th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String a = JOptionPane.showInputDialog("who");
		// 3. Print out what the user typed

		// 4. if user asked for "mom"
		if (a.equals("mom")) {
			System.out.println(momsBirthday);
		}
		else	if (a.equals("dad")) {
			System.out.println(dadsBirthday);
		}
		else	if (a.equals("me")) {
			System.out.println(myBirthday);
			
		}else{
			System.out.println("not found in database");
		}
		}
		
		
		
		
		
		}
	
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	 

