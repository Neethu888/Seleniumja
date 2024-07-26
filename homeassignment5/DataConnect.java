package homeassignment5;

public class DataConnect {
	public class JavaConnect  implements DataBase{

		public void main(String[] args) {
			
			JavaConnect jc = new JavaConnect();
			jc.connect();
			jc.disConnect();
			jc.executeUpdate();

		}

		@Override
		public void connect() {

			System.out.println("Connect the database.");
			
		}

		@Override
		public void disConnect() {
			System.out.println("Disconnect the database.");
			
		}

		@Override
		public void executeUpdate() {
			System.out.println("Update the data in the given database and execute it.");
			
		}

	}

}
