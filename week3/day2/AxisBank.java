package week3.day2;

public abstract class AxisBank implements RBI,AxisRules{
	String name;
	String panNo;
	String aadharNo;
	public void kyc() {
		System.out.println("Customer name is "+name);
		System.out.println("Customer pan number is "+panNo);
		System.out.println("Customer aadhar number is"+aadharNo);
	}
	public void withdrawalLimit() {
		System.out.println("each person will withdrawal the maximum amount of rupees 50000 per day");
	}
	public static void main(String []agrs) {
        
	}
}
	
