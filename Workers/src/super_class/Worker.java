package super_class;

public abstract class Worker extends Person implements Operations {
		private int id;

		public Worker() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Worker(String name, int age, String mob, int id) {
			super(name, age, mob);
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
}
