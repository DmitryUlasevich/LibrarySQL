package by.htp.jdbc.service;

import java.util.List;

import by.htp.jdbc.domain.Catalog;
import by.htp.jdbc.domain.Employee;
import by.htp.jdbc.persistance.BookDao;
import by.htp.jdbc.persistance.BookDaoImpl;
import by.htp.jdbc.persistance.EmployeeBookDao;
import by.htp.jdbc.persistance.EmployeeBookImpl;

public class EmployeeBookServiceImpl implements EmployeeBookService{

	private EmployeeBookDao dao= new EmployeeBookImpl();
	
	public List<Employee> moreOne() {
		
		List<Employee> employee = dao.findMoreOne();
		
		Employee employees = new Employee();
		return employee;
	}

}
