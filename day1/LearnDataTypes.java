package week1.day1;

public class LearnDataTypes {

	public static void main(String[] args) {
		//To store any values-->use variable and datatypes
		//syntax to delcare value is
			//datatypes variableName=value (based on datatype);
			//To store whole number--->byte,short,int,long

		byte javaMemory=32;
		boolean areknowJava=true;
		short idNum = 12345;
		long phno=8765432978l;
		int age=30;
		//To store decimal values-->float and double
		double usDollarPrice=84.89;
		float pievalue=3.14f;
		//To store single values-->char,and the value should with in single quote,or can use ascii table value
		char logo = 'T';
		char upperA = 65;
		//to store seq character-->string
		String companyName = "TestLeaf";
		System.out.println("The java memory is "+javaMemory);
		System.out.println("Company name is "+companyName);
        System.out.println("Company Logo "+logo);
        System.out.println("The usa dollar price is "+usDollarPrice +"\nMy phone number is "+ phno);
        System.out.println("The ascii value of 65 is "+ upperA);
	}


}
