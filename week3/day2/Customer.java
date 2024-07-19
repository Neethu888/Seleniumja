package week3.day2;

public class Customer extends AxisBank {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.CreditCard();
		c.name="gokul";
		c.panNo="adk12345df";
		c.kyc();
		c.deposit(49999);
		c.withdrawalLimit();
	}
	
	public void CreditCard() {
		System.out.println("not required");
		
		

	}

}
