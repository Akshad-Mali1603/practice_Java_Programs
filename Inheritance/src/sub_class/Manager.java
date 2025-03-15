package sub_class;

public class Manager extends Employee {
		private float da;
		private float hra;
		private float totalSalary;
		
		
		
		public Manager() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Manager(int id, String dept, float basicSalary, String pfaccno, float tax, float da, float hra,
				float totalSalary) {
			super(id, dept, basicSalary, pfaccno, tax);
			this.da = da;
			this.hra = hra;
			this.totalSalary = totalSalary;
		}



		public float getDa() {
			return da;
		}
		public void setDa(float da) {
			this.da = da;
		}
		public float getHra() {
			return hra;
		}
		public void setHra(float hra) {
			this.hra = hra;
		}
		public float getTotalSalary() {
			return totalSalary;
		}
		public void setTotalSalary(float totalSalary) {
			this.totalSalary = totalSalary;
		}
}
