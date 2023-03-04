package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// declaring array 
		String[] myArray = new String[3];
		
		// assigning value to the array
		myArray[0] = "Selenium";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";
		
		System.out.println(myArray[1]);
		
		for (int i=0; i<myArray.length; i++ )
		{System.out.println(myArray[i]);}
		
		// another way of declaring and adding value
		int [] number = {4,2,7};
	
	    for (int i=0; i<number.length; i++)
	    {System.out.println(number[i]);
	    
	    }
	
		// example of enhanced for loop
		System.out.println("start");
		for (int v: number) {
			System.out.println(v);
		}
		
	
	}

}
