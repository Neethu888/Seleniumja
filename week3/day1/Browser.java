package week3.day1;

public class Browser {
	public void openurl() {
		System.out.println("open the url");
	}
	public void closeBrowser() {
		System.out.println("close the Browser");
	}
	public void navigateBack() {
		System.out.println("navigate is before back");
	}
	public static void main(String[]args) {
		Browser b=new Browser();
		System.out.println("browsername");
		System.out.println("browserversion");
		b.openurl();
		b.closeBrowser();
		b.navigateBack();
		
		
		
		
		


	}

}
