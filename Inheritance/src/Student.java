
public class Student extends Person {
		 protected int roll;
		 protected float marks;
		public Student(int age, String name, String address, String mob, String dob, int roll, float marks) {
			super(age, name, address, mob, dob);
			this.roll = roll;
			this.marks = marks;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Student [roll=" + roll + ", marks=" + marks + ", toString()=" + super.toString() + "]";
		}
		public Student() {
			super();
			
		}
	
	
		
		 
}
