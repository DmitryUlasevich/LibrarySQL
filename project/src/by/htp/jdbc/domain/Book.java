package by.htp.jdbc.domain;

public class Book extends Entity{
	
	private static final long serialVersionUID = 2416434793756412787L;
	
	private String title;
	private Author author;
	
	public Book(int id, String title, Author author) {
		super(id);
		this.title = title;
		this.author = author;
	}

	public Book() {
		super();//mozhno ubrat
	}

	public Book(int id) {
		super(id);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return super.toString() + "Title: " + title + ", " + " " +this.getAuthor().toString();
	}	
}

