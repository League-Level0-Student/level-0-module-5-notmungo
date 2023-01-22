package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Alghorithms {
	
public static void main(String[] args) {
	boolean isComposite = false ;
	     
	String alghorithms = JOptionPane.showInputDialog(null, "Give me a number!");
	
	for(int i = 2; i < Integer.parseInt(alghorithms); i ++) {
		    
		    if (Integer.parseInt(alghorithms) % i == 0 ) {
		        System.out.println("this number is composite");
		        isComposite = true;
		        break;
		        
		    }
		    
		        
		    
	}
	if (isComposite == false) {
		JOptionPane.showMessageDialog(null, "This number is prime.");
	}
	
	
}

}
