package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String Goofy = JOptionPane.showInputDialog(null, "What is your name?");

		// 2. Print upper case name to the console using .toUpperCase()
		System.out.println(Goofy.toUpperCase());
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 7).
		// HINT: Use .length() to determine the number of characters in the String
		for (int i = 0; i < Goofy.length(); i++) {
			// 4. Create a char variable to store the next character of the name
			// use .charAt()
			char var = Goofy.charAt(i);

			// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			if (i % 2 == 0) {
				var = Character.toUpperCase(var);
			} else {
				var = Character.toLowerCase(var);
			}
			goofyName += var;
			// 6. Even characters should be made uppercase and odd characters made lowercase
			// HINT: use Character.toUpperCase() or Character.toLowerCase()

			// 7. ADD the char to the end of the goofyName String
		}
JOptionPane.showMessageDialog(null, goofyName);
		// 8. Use pop-up to show user their Goofy name

	}
}
