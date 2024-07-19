package week3.day1;

public class Chrome extends Browser {
   public void openIncognito() {
	   System.out.println("openIncognito");
   }
   public void clearCache() {
	   System.out.println("clearCache");
   }
   public static void main(String[]args) {
	   Chrome ch=new Chrome();
	   ch.openIncognito();
	   ch.clearCache();
	   ch.openurl();
	   ch.closeBrowser();
	   ch.navigateBack();
	   
		

	}

}
