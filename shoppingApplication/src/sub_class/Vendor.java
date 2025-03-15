package sub_class;

public class Vendor {
	private static int idvcount=0001;
	private int id;
	private String name;
	private String email;
	private String address;
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(String name, String email, String address) {
		super();
		this.id = idvcount++;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void vendorDisplay() {
		System.out.println("Vendor ID: "+this.id
				+"\n Name: "+this.name
				+"\n Email: "+this.email
				+"\n Address: "+this.address
				+"\n------------------------------------");
	}
	
	
}
