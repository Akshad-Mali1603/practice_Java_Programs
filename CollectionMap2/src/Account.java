
public class Account {
		private int accNumber;
		private String custName;
		private double accBal;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Account(int accNumber, String custName, double accBal) {
			super();
			this.accNumber = accNumber;
			this.custName = custName;
			this.accBal = accBal;
		}
		public int getAccNumber() {
			return accNumber;
		}
		public void setAccNumber(int accNumber) {
			this.accNumber = accNumber;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public double getAccBal() {
			return accBal;
		}
		public void setAccBal(double accBal) {
			this.accBal = accBal;
		}
		
		
}
