package super_class;

public class Account {
		private int accNo;
		private String accOnwerName;
		private float accBalance;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Account(int accNo, String accOnwerName, float accBalance) {
			super();
			this.accNo = accNo;
			this.accOnwerName = accOnwerName;
			this.accBalance = accBalance;
		}
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getAccOnwerName() {
			return accOnwerName;
		}
		public void setAccOnwerName(String accOnwerName) {
			this.accOnwerName = accOnwerName;
		}
		public float getAccBalance() {
			return accBalance;
		}
		public void setAccBalance(float accBalance) {
			this.accBalance = accBalance;
		}
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", accOnwerName=" + accOnwerName + ", accBalance=" + accBalance + "]";
		}
		
}
