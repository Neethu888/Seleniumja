package week3.day2;



public interface RBI {
   public void kyc(); //abstract method /unimplemented method
   default void deposit(int amount){   // implemented method
	 System.out.println("Deposit the amount of rupees"+amount);
   }
   public static void main(String[]agrs) {
	   System.out.println("This is interface");
	
	   
}
}
