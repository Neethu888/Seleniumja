package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,num3=1;
		System.out.println(num1);
		for(int i=1;i<=10;i++) {
			System.out.println(num3);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
		}
			
	}

}
