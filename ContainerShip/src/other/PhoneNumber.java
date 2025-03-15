package other;

public class PhoneNumber {
		private int phno;
		private int countryCode;
		private String countryName;
		public PhoneNumber() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PhoneNumber(int phno, int countryCode, String countryName) {
			super();
			this.phno = phno;
			this.countryCode = countryCode;
			this.countryName = countryName;
		}
		public int getPhno() {
			return phno;
		}
		public void setPhno(int phno) {
			this.phno = phno;
		}
		public int getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(int countryCode) {
			this.countryCode = countryCode;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		@Override
		public String toString() {
			return "PhoneNumber [phno=" + phno + ", countryCode=" + countryCode + ", countryName=" + countryName + "]";
		}
		
}
