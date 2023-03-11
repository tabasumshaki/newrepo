package inheritence;

public class Test implements InterfaceDemo{

	public static void main(String[] args) {
		
//		Test obj = new Test();
//		obj.makeSound();

		
		
		ConstructorDemo obj1 = new ConstructorDemo("Masud", 1);
		obj1.setName("Masud");
		System.out.println(obj1.getName()); 
		
	}

	
	public void makeSound() {
		System.out.println("Please sing a sweet song");
		
		
		
		
	}

}
