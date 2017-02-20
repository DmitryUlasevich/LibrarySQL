package by.htp.jdbc.domain;

import java.util.Date;

public class Author extends Entity{


	private static final long serialVersionUID = -1029507436873886815L;
	
	private String name;
	private int date;
	public Author(int id, String name, int date) {
		super(id);
		this.name = name;
		this.date = date;
	}
	public Author() {
		super();
	}
	public Author(int id) {
		super(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	public String toString() {
		return "Author: " + name + ", date: " + date + ";";
	}
}
