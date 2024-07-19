package week3.day1;

public class APIClient{
			
				public void ReportStep(String mgs,String status){
					System.out.println("sending report"+mgs+"and the status is "+status);
		}
				public void ReportStep(String mgs,String status,Boolean snap) {
		             System.out.println("sending report"+mgs+",the status is "+status+"and the booleansnap is"+snap);
		
				}
				public static void main (String[]args) {
					APIClient a=new APIClient();
					a.ReportStep("displayed","updated");
					a.ReportStep("displayed","updated",true);
				
				}

	


	}


