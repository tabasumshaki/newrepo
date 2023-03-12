package actionItem03;

public class Sum {

	// qs4. sum even number from 20 - 40.
	
	public static void main(String[] args) {
		
		dosum();
		dosum1();
		
	}

	public static void dosum() {
		
		int start = 20, end = 40, sum = 0;
		while (start<=end) {
			sum = sum+start;
			start = start+2;
			
		}
		System.out.println(sum);
		
		
		
	}
	
	public static void dosum1() {
		
		int start = 20, end = 40, sum = 0;
		while (start<=end) {
			if (start %2==0) {
				sum+= start;
			}
			start ++;
		}
		System.out.println("sum of even numbers using another way"+sum);
		
		
		
	}
	
	
	
}
