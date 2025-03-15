package Admission;

public class Teacher {
		private int id;
		private String name;
		private String dept;
		private String email;
		private String mob;
		private float salary;
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Teacher(int id, String name, String dept, String email, String mob, float salary) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.email = email;
			this.mob = mob;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMob() {
			return mob;
		}
		public void setMob(String mob) {
			this.mob = mob;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + ", email=" + email + ", mob=" + mob
					+ ", salary=" + salary + "]";
		} 
				
}
