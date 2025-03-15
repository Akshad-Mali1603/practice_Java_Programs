package Inheritance;

public class Company extends Vehicle {
		private  String companyName;
		private String companyLocation;
		private String companyMob;
		private String companyRegDate;
		private String companyRegNo;
		public Company() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Company(int no, String color, int seat, String fuel, float price, float mileage, String companyName,
				String companyLocation, String companyMob, String companyRegDate, String companyRegNo) {
			super(no, color, seat, fuel, price, mileage);
			this.companyName = companyName;
			this.companyLocation = companyLocation;
			this.companyMob = companyMob;
			this.companyRegDate = companyRegDate;
			this.companyRegNo = companyRegNo;
		}

		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getCompanyLocation() {
			return companyLocation;
		}
		public void setCompanyLocation(String companyLocation) {
			this.companyLocation = companyLocation;
		}
		public String getCompanyMob() {
			return companyMob;
		}
		public void setCompanyMob(String companyMob) {
			this.companyMob = companyMob;
		}
		public String getCompanyRegDate() {
			return companyRegDate;
		}
		public void setCompanyRegDate(String companyRegDate) {
			this.companyRegDate = companyRegDate;
		}
		public String getCompanyRegNo() {
			return companyRegNo;
		}
		public void setCompanyRegNo(String companyRegNo) {
			this.companyRegNo = companyRegNo;
		}
		@Override
		public String toString() {
			return "Company [companyName=" + companyName + ", companyLocation=" + companyLocation + ", companyMob="
					+ companyMob + ", companyRegDate=" + companyRegDate + ", companyRegNo=" + companyRegNo
					+ ", toString()=" + super.toString() + "]";
		}
		
		
}
