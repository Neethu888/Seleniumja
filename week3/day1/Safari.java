package week3.day1;

public class Safari extends Browser{
	public void readerMode() {
		System.out.println("readerMode is success");
	}
	public void fullScreenMode() {
		System.out.println("fullScreenMode is success");
	}
	public static void main(String[]args) {
		Safari s=new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.openurl();
		s.closeBrowser();
		
		

	

	}

}
