package sub_class;

import super_class.Account;

public class Current extends Account {
		private String currentCompanyName;

		public Current() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Current(int accNo, String accOnwerName, float accBalance, String currentCompanyName) {
			super(accNo, accOnwerName, accBalance);
			this.currentCompanyName = currentCompanyName;
		}

		public String getCurrentCompanyName() {
			return currentCompanyName;
		}

		public void setCurrentCompanyName(String currentCompanyName) {
			this.currentCompanyName = currentCompanyName;
		}

		@Override
		public String toString() {
			return "Current [currentCompanyName=" + currentCompanyName + ", toString()=" + super.toString() + "]";
		}
		
		
}
