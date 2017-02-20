package by.htp.jdbc.domain;

import java.io.Serializable;

public abstract class Entity implements Serializable{
	

	private static final long serialVersionUID = 1468975166699509185L;
	private int id;

	public Entity(int id) {
		super();
		this.id = id;
	}

	public Entity() {
		super(); //mozhno ubrat
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id + ", ";
	}
	
	
}
