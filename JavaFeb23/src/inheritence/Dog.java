package inheritence;

public class Dog extends Animal{
	
	public static void main(String[] args) {
		
		Dog obj = new Dog();
		
		obj.sound();
		
		
		/*
		 * 
		 */
		
	}
	
	
	  public void sound() {
	  
	  System.out.println("Make dog sound");// if child class have same
	  //function(method) of parent class then
	  
	  // jvm will run from the sub class. it shows in console make dog sound
	  // instead generic sound.
	  
	  }
	 
}
