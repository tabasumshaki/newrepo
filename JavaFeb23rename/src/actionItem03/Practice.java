package actionItem03;

// qs3. write a program that returns factorial.

public class Practice {

	public static void main(String[] args) {

		System.out.println("Hey is it working?");
		
		doFactorial(8);
		
	}

	public static void doFactorial(int number) {

		int i = 1;
		long factorial = 1;

		while (i <= number) {
			factorial *= i;
			i++;
		}
		
		System.out.printf("Factorial of %d = %d",number, factorial);
		//System.out.printf("Factorial of %d = %d", number, factorial);
	}
}
