package by.htp.jdbc.controller;

import java.util.List;

import by.htp.jdbc.domain.Book;
import by.htp.jdbc.domain.Catalog;
import by.htp.jdbc.domain.Employee;
import by.htp.jdbc.service.BookService;
import by.htp.jdbc.service.BookServiceImpl;
import by.htp.jdbc.service.EmployeeBookService;
import by.htp.jdbc.service.EmployeeBookServiceImpl;

public class Main {	
	
	public static void main(String[] args){
		chooseItem(1);
		chooseItem(2);
		chooseItem(1);
		chooseItem(4);
		chooseItem(5);
		chooseItem(9);
		chooseItem(1);
		
		//chooseItem(3);
		//chooseItem(1);
		
	}
	private static  void chooseItem(int item){
		
		BookService service = new BookServiceImpl();
				
		switch(item){
		
		case 1:
			Catalog catalog = service.viewCatalog();
			System.out.println(catalog);
			service.viewCatalog();
			break;
		
		case 2:
			Catalog catalog2 = service.viewUpdatedCatalog();
			System.out.println(catalog2);
			service.viewUpdatedCatalog();
			break;
			
		case 3:
			Catalog catalog3 = service.viewRemovedCatalog();
			System.out.println(catalog3);
			service.viewUpdatedCatalog();
			break;
		case 4:
			Book book = service.viewBookByID();
			System.out.println(book);
			service.viewBookByID();
			break;
		case 5:
			Book book2 = service.viewBookByTitle();
			System.out.println(book2);
			service.viewBookByTitle();
			break;
		}
		
		EmployeeBookService service2 = new EmployeeBookServiceImpl();
		
		switch(item){
		
		case 9:
		List<Employee> employee = service2.moreOne();
		System.out.println(employee);
		service.viewBookByTitle();
		break;
		}
	}
}
