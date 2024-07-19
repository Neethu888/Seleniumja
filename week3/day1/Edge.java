package week3.day1;

public class Edge extends Browser{
	public void takesnap() {
		System.out.println("takesnap");
	}
	public void clearCookies() {
		System.out.println("clearcookies");
	}
	public static void main (String[]args) {
		Edge e=new Edge();
		e.takesnap();
		e.clearCookies();
		e.openurl();
		e.closeBrowser();
		
		

	}

}
