package by.htp.jdbc.service;

import by.htp.jdbc.domain.Book;
import by.htp.jdbc.domain.Catalog;
import by.htp.jdbc.domain.Employee;

public interface BookService {
	
	Catalog viewCatalog();
	Catalog viewUpdatedCatalog();
	Catalog viewRemovedCatalog();
	Book viewBookByID();
	Book viewBookByTitle();
}
