package by.htp.jdbc.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.jdbc.domain.Author;
import by.htp.jdbc.domain.Book;
import by.htp.jdbc.domain.Employee;

public class EmployeeBookImpl implements EmployeeBookDao{
	
	public List<Employee> findMoreOne() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		List<Employee> employee = new ArrayList<Employee>();
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			st = con.createStatement();
			rs = st.executeQuery("SELECT Employee.Id, Employee.name, Employee.date_of_birth, Employee.email, COUNT(employee_id) FROM library.Employee "
					+ "Join Library.Employee_book on Employee.id = Employee_book.employee_id group by Employee.name having COUNT(employee_id) >=2");
			
			while (rs.next()){
				//Book book = new Book();
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String date = rs.getString("date_of_birth");
				String email = rs.getString("email");
				
				Employee book = new Employee(id, name, date, email);			
				employee.add(book);
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
		
		return employee;
	}
}
