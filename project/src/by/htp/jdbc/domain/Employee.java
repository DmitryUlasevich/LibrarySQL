package by.htp.jdbc.domain;

public class Employee extends Entity{

	private static final long serialVersionUID = -1377996290511133576L;
	
	private String name;
	private String date;
	private String email;
	
	public Employee(int id, String name, String date, String email) {
		super(id);
		this.name = name;
		this.date = date;
		this.email = email;
	}


	public Employee() {
		super();//mozhno ubrat
	}

	public Employee(int id) {
		super(id);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee: " + name + ", date=" + date + ", email=" + email;
	}

	
}

