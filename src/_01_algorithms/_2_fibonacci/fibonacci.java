package _01_algorithms._2_fibonacci;

public class fibonacci {
	
public static void main(String[] args) {
	int numb1 = 0 ;
	int numb2 = 1;
	int sum ;
	
	for(int i = 0; i < 10; i++);{
		
		sum = numb1 + numb2;
		System.out.println(sum);
		numb1 = numb2;
	    numb2 = sum;
		
	}
}

}
