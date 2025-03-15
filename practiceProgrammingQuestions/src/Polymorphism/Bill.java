package Polymorphism;

public class Bill {
	private int id;
	private String Name;
	private int total;

	public Bill(int id, String name, int... amt) {
		this.id = id;
		this.Name = name;
		for (int x : amt) {
			this.total += x;
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", Name=" + Name + ", total=" + total + "]";
	}

	public static Bill search(Bill[] b,int n, int id) {
		for (int i = 0; i < n; i++)  {
			if (b[i].getId() == id)
				return b[i];
		}
		return null;
	}

	public static Bill search(Bill[] b, int n,String name) {
		for (int i = 0; i < n; i++) {
			if (b[i].getName().compareToIgnoreCase(name) == 0)
				return b[i];
		}
		return null;
	}

	public static int delete(Bill[] b, int n, int id) {
		for (int i = 0; i < n; i++) {
			if(b[i].getId()==id) {
				for (int j = i; j < n; j++) {
					b[j]=b[j+1];
				}
				n--;
			}
		}
		return n;
	}

	public static int delete(Bill[] b, int n, String name) {
		for (int i = 0; i < n; i++) {
			if(b[i].getName().compareToIgnoreCase(name)==0) {
				for (int j = 0; j < n; j++) {
					b[j]=b[j+1];
				}
				n--;
			}
		}
		return n;
	}

}