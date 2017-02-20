package by.htp.jdbc.persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.jdbc.domain.Author;
import by.htp.jdbc.domain.Book;

public class BookDaoImpl implements BookDao{

	public int create(Book book) {

		return 0;
	}


	public List<Book> findAll() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		List<Book> books = new ArrayList<Book>();
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			st = con.createStatement();
			rs = st.executeQuery("SELECT id, brief, author, publish_year FROM book");	
			
			while (rs.next()){
				//Book book = new Book();
				
				int id = rs.getInt("id");
				String brief = rs.getString("brief");
				String name = rs.getString("author");
				int date = rs.getInt("publish_year");
				
				Book book = new Book(id, brief, new Author(id, name, date));			
				books.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(con != null){
				try{
				con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		}
		
		return books;
	}


	public Book findById() {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Book book = new Book();
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM book where ID = '6'");		
			while (rs.next()){
				
				int id = rs.getInt("id");
				String brief = rs.getString("brief");
				String name = rs.getString("author");
				int date = rs.getInt("publish_year");
				Book book2 = new Book(id, brief, new Author(id, name, date));
				book = book2;
					}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(con != null){
				try{
				con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		}
		return book;
	}
	
public Book fetchByTitle() {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Book book = new Book();
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM book where brief = 'War and Peace'");
			
			while (rs.next()){
				
				int id = rs.getInt("id");
				String brief = rs.getString("brief");
				String name = rs.getString("author");
				int date = rs.getInt("publish_year");
				Book book2 = new Book(id, brief, new Author(id, name, date));
				book = book2;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(con != null){
				try{
				con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		}
		return book;
	}


	public List<Book> update() {
		
		Connection con = null;
		Statement st = null;
		
		List<Book> books = new ArrayList<Book>();
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			st = con.createStatement();
			String query = "UPDATE book SET author = ? WHERE publish_year < ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "UNKNOWN");
			pstmt.setString(2, "1900");
			pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(con != null){
				try{
				con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		}
		return books;
	}


	public List<Book> delete() {
		
		Connection con = null;
		Statement st = null;
		
		List<Book> books = new ArrayList<Book>();
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			st = con.createStatement();
			String query = "DELETE FROM book WHERE publish_year < ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "2000");
			pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(con != null){
				try{
				con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		}
		return books;
	}

	public int create() {

		return 0;
	}
}
