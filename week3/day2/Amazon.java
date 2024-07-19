package week3.day2;

public class Amazon extends CanaraBank{
	public static void main(String[]args) {
		Amazon a=new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordpaymentdetails();
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("To get cashOnDelivery");
			}
	@Override
	public void upiPayments() {
         System.out.println("To get upipayments");	
	}

	@Override
	public void cardPayments() {
	 System.out.println("To get cardPayments");
	 }

	@Override
	public void internetBanking() {
		System.out.println("To get internetBanking");
		
	}

	@Override
	public void recordpaymentdetails() {
	 System.out.println("recorded the payment details");
	 
		
	}

	}


