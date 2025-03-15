package Inheritance;

public class Car extends Company {
		private String carOwnerName;
		private int carInsuranceNO;
		private String carType;
		private String carNo;
		private String carMode;
		private boolean carAutomatic;
		private String carCompanyName;
		public Car(int no, String color, int seat, String fuel, float price, float mileage, String companyName,
				String companyLocation, String companyMob, String companyRegDate, String companyRegNo,
				String carOwnerName, int carInsuranceNO, String carType, String carNo, String carMode,
				boolean carAutomatic, String carCompanyName) {
			super(no, color, seat, fuel, price, mileage, companyName, companyLocation, companyMob, companyRegDate,
					companyRegNo);
			this.carOwnerName = carOwnerName;
			this.carInsuranceNO = carInsuranceNO;
			this.carType = carType;
			this.carNo = carNo;
			this.carMode = carMode;
			this.carAutomatic = carAutomatic;
			this.carCompanyName = carCompanyName;
		}
		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getCarOwnerName() {
			return carOwnerName;
		}
		public void setCarOwnerName(String carOwnerName) {
			this.carOwnerName = carOwnerName;
		}
		public int getCarInsuranceNO() {
			return carInsuranceNO;
		}
		public void setCarInsuranceNO(int carInsuranceNO) {
			this.carInsuranceNO = carInsuranceNO;
		}
		public String getCarType() {
			return carType;
		}
		public void setCarType(String carType) {
			this.carType = carType;
		}
		public String getCarNo() {
			return carNo;
		}
		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}
		public String getCarMode() {
			return carMode;
		}
		public void setCarMode(String carMode) {
			this.carMode = carMode;
		}
		public boolean isCarAutomatic() {
			return carAutomatic;
		}
		public void setCarAutomatic(boolean carAutomatic) {
			this.carAutomatic = carAutomatic;
		}
		public String getCarCompanyName() {
			return carCompanyName;
		}
		public void setCarCompanyName(String carCompanyName) {
			this.carCompanyName = carCompanyName;
		}
		@Override
		public String toString() {
			return "Car [carOwnerName=" + carOwnerName + ", carInsuranceNO=" + carInsuranceNO + ", carType=" + carType
					+ ", carNo=" + carNo + ", carMode=" + carMode + ", carAutomatic=" + carAutomatic
					+ ", carCompanyName=" + carCompanyName + ", toString()=" + super.toString() + "]";
		}
		
		
}
