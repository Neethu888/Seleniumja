package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println(a%b);
        System.out.println("A value before preIncrement");
        System.out.println(a);
        
        //postincrement ++
        System.out.println(a++);  //a=1,a+1
        System.out.println(a);
        
        //preIncrement
        System.out.println(++a);   //a=2,a=a+1
        
        //comparsion operators--->returns boolean-->true or false
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        }

}
