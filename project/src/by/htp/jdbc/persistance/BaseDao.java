package by.htp.jdbc.persistance;

import java.util.List;

import by.htp.jdbc.domain.Book;

public interface BaseDao {
	
	public static final String URL = "jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false";
	public static final String LOGIN = "root";
	public static final String PASS = "mitrofan1";
	
	int create();
	List <Book> findAll();
	Book findById();
	List <Book> update();
	List <Book> delete();
	Book fetchByTitle();

}
