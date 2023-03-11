package encapsulation;

public class bank {
	
	int accountNumber = 12345678;
	private int pinNumber = 1234;
	private double balance = 150000;
	
	// this private means access modifier.
	
	public void drawMoney(int actno, int pin, int amount ) {
		
		if (actno==accountNumber && pin== pinNumber) {
			
			if (amount<=balance) {
				balance = balance - amount;
				System.out.println("Amount withdrawn : "+ amount);
			}else {
				System.out.println("Insufficient Balance");
			}
			
			
		}else {
			System.out.println("Invalid credentials");
		}
		
	}
	
	
	
	
 public void updatePin(int actno, int oldpin, int newpin) {
	 
	 if (actno == accountNumber && oldpin==pinNumber) {
		 pinNumber = newpin;
		 System.out.println("Pin is updated.");
	 }else {
		 System.out.println("Invalid credentials");
	 }
 }

// another way of encapsulation , from source to getters and setters 


public int getPinNumber() {
	return pinNumber;
}




public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}




public double getBalance() {
	return balance;
}




public void setBalance(double balance) {
	this.balance = balance;
}




public int getAccountNumber() {
	return accountNumber;
}	
	
	
	
	
	
	

}
