package by.htp.jdbc.persistance;

import by.htp.jdbc.domain.Book;

public interface BookDao extends BaseDao{

	Book fetchByTitle();
	
}
