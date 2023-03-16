package inheritence;

public class ConstructorDemo {

	String name;
	int rollNo;
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getRollNo() {
		return rollNo;
	}
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
	// example of a constructor
	
		public ConstructorDemo(String name, int rollNo) {
			
			this.name = name;         // if we use this two line 
			this.rollNo = rollNo;      // we dont need getter setter method anymore.
			System.out.println(" I am a default constructor ");
		}
		
	
	
	
	
	
	
	
	
	
}
