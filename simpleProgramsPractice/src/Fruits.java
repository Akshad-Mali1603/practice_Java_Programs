
public class Fruits{
	
		private String name;
		private String color;
		public Fruits(String name, String color) {
			super();
			this.name = name;
			this.color = color;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Fruit name: " + name + "\nFruit color: " + color;
		}
		
}
