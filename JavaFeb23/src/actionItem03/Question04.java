package actionItem03;

public class Question04 {

	public static void main(String[] args) {
		
		// Sum of even numbers using for loop
		System.out.println("For loop: Addition of even numbers");
		int s = 0;
		for (int i=20; i<=40; i++) {
		if (i%2 == 0)
		s = s+i; 
		}
		System.out.println("The sum result of even numbers from 20 - 40 is : "+s);

		
		
		// Sum of even numbers using while loop
		
		System.out.println("While loop: Addition of even numbers");
		
		int i=20;
		int n=0;
		while (i<=40) {
			if (i%2==0)
			n= n+i;
			i++;
		}
		System.out.println("The sum result of even numbers from 20 - 40 is : "+ n);
		
		
		
		
		
	}

}
