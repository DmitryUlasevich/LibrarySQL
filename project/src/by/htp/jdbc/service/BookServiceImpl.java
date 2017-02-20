package by.htp.jdbc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.jdbc.domain.Book;
import by.htp.jdbc.domain.Catalog;
import by.htp.jdbc.domain.Employee;
import by.htp.jdbc.persistance.BookDao;
import by.htp.jdbc.persistance.BookDaoImpl;

public class BookServiceImpl implements BookService{

	private BookDao dao= new BookDaoImpl();
	
	public Catalog viewCatalog() {
		
		List<Book> books = dao.findAll();
		
		Catalog catalog = new Catalog(books);
		return catalog;
	}
	
	public Catalog viewUpdatedCatalog() {

		List<Book> books = dao.update();
		
		Catalog catalog = new Catalog(books);
		return catalog;
	}
	
	public Catalog viewRemovedCatalog() {

		List<Book> books = dao.delete();
		
		Catalog catalog = new Catalog(books);
		return catalog;
	}
	
	public Book viewBookByID() {

		Book book = dao.findById();
		return book;
	}
	
	public Book viewBookByTitle() {
		Book book = dao.fetchByTitle();
		return book;
	}
}
