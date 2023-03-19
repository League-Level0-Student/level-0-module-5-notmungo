package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String s;
	public static void main(String[] args) {
		 
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
 s = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
			
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
 			for (int i = 0; i < 4; i++) {
 				
 			
 				

			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "options", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "walk", "water" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				cuddle();
			}
			if (task == 1) {
				walk();
			}
			if (task == 2) {
			    water();
			}
 			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
		static void cuddle() {
			if (s.equals("cat")) {
				JOptionPane.showMessageDialog(null, "cat may purr when cuddled");
				happinessLevel += 2;
				JOptionPane.showMessageDialog(null, "happiness level" + happinessLevel);
			}
			else if (s.equals("dog")) {
				JOptionPane.showMessageDialog(null, "dog may bark if cuddled");
				happinessLevel += 1;
				JOptionPane.showMessageDialog(null, "happiness level " + happinessLevel);
			}
			else {
				JOptionPane.showMessageDialog(null, "will stay still");
				happinessLevel += 0;
			}
		 }
		static void walk () {
			if (s.equals("cat")) {
				JOptionPane.showMessageDialog(null, "cat may resist");
				happinessLevel -= 1;
				JOptionPane.showMessageDialog(null, "happiness level" + happinessLevel);
			}
			else if (s.equals("dog")) {
				JOptionPane.showMessageDialog(null, "dog will proudly go");
				happinessLevel += 2;
				JOptionPane.showMessageDialog(null, "happiness level " + happinessLevel);
			}
			else {
				JOptionPane.showMessageDialog(null, "will be neutral");
				happinessLevel += 0;
			}
		}
		static void water () {
			if (s.equals("cat")) {
				JOptionPane.showMessageDialog(null, "will resist a bath");
				happinessLevel -= 1;
				JOptionPane.showMessageDialog(null, "happiness level" + happinessLevel);
			}
			else if (s.equals("dog")) {
				JOptionPane.showMessageDialog(null, "will probably like it");
				happinessLevel += 2;
				JOptionPane.showMessageDialog(null, "happiness level" + happinessLevel );
			}
			else {
				JOptionPane.showMessageDialog(null, "will probably be fine");
				happinessLevel += 0;
			}
		}
	
		 
}