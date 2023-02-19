package _02_nested_loops._3_for_loop_gauntlet;

public class Nested {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}
		
		 
			 for (int j = 2; j <= 100; j+=2) {				 
			 System.out.println(j);
			 }
			 for (int j = 1; j<= 99; j+=2) {
			 System.out.println(j);
		 }
	         for (int j = 1; j<= 500; j++) {
	         if (j % 2 ==0) {
	        	 System.out.println(j + " is even");
	        	 
	         }
	         else {
	        	 System.out.println(j + " is odd");
	        	 
	         }
	        
	        	 
	         }
	         for(int j = 0; j <= 777; j+=7) {
	        	 System.out.println(j);
	        	 
	         }
	}
}
