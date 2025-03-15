package other;

public class Address {
		private int flateNo;
		private String buildingName;
		private String StreetName;
		private int pincode;
		private String Landmark;
		private String city;
		private String state;
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(int flateNo, String buildingName, String streetName, int pincode, String landmark, String city,
				String state) {
			super();
			this.flateNo = flateNo;
			this.buildingName = buildingName;
			StreetName = streetName;
			this.pincode = pincode;
			Landmark = landmark;
			this.city = city;
			this.state = state;
		}
		public int getFlateNo() {
			return flateNo;
		}
		public void setFlateNo(int flateNo) {
			this.flateNo = flateNo;
		}
		public String getBuildingName() {
			return buildingName;
		}
		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}
		public String getStreetName() {
			return StreetName;
		}
		public void setStreetName(String streetName) {
			StreetName = streetName;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getLandmark() {
			return Landmark;
		}
		public void setLandmark(String landmark) {
			Landmark = landmark;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Address [flateNo=" + flateNo + ", buildingName=" + buildingName + ", StreetName=" + StreetName
					+ ", pincode=" + pincode + ", Landmark=" + Landmark + ", city=" + city + ", state=" + state + "]";
		}
		
		
		
}
