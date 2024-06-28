package week1.day2;

public class Hotel {
 
	public int dosa(int quatity) {
		int price=30;
		 
		System.out.println("This is dosa");
		int totalAmt=price*quatity;
		return totalAmt;
	}
	public void idly(int quatity) {
		int price =20;
		System.out.println("This is idly");
	}
	public int chappathi(int quatity) {
		int price=35;
		System.out.println("This is chappathi");
		int totalAmt=price*quatity;
		return totalAmt;
	}
	public static void main(String[]args) {
		Hotel person1=new Hotel();
		int totalAmount1=person1.dosa(2);
		int chappathi=person1.chappathi(1);
		System.out.println(totalAmount1+chappathi);
	}

	}

