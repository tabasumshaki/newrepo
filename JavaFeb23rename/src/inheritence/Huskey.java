package inheritence;

public class Huskey extends Dog{

	public static void main(String[] args) {
		
		Huskey obj = new Huskey();
		
		obj.sound();
		
		

	}

	public void sound() {
		  
		  System.out.println(" Oooofff ");// if child class have same
		  //function(method) of parent class then
		  
		  // jvm will run from the sub class. it shows in console make dog sound
		  // instead generic sound.
		  
		  }
	
	
	
}
