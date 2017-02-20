Create Database Library;

CREATE TABLE Library.Book (
ID Integer PRIMARY KEY,
Brief VARCHAR(50),
Publish_year INTEGER,
Author VARCHAR(255)
);

CREATE TABLE Library.Employee (
ID Integer PRIMARY KEY,
Name VARCHAR(255),
Date_of_birth DATE,
Email VARCHAR(50)
);

CREATE TABLE Library.Employee_Book (
Book_ID INTEGER,
Employee_ID INTEGER,
ID INTEGER,
CONSTRAINT pk_emplbook PRIMARY KEY(Book_ID, Employee_ID),
CONSTRAINT fk_roles FOREIGN KEY(Book_ID)
REFERENCES Book(ID),
CONSTRAINT fk_roles1 FOREIGN KEY(Employee_ID)
REFERENCES Employee(ID)
);

Insert Into Library.Book(Id, Brief, Publish_year, Author)
Values
('1', 'Harry Potter and the Philosophers Stone', '1997', 'J. K. Rowling'),
('2', 'Harry Potter and the Chamber of Secrets', '1998', 'J. K. Rowling'),
('3', 'Harry Potter and the Prisoner of Azkaban', '1999', 'J. K. Rowling'),
('4', 'Harry Potter and the Goblet of Fire', '2000', 'J. K. Rowling'),
('5', 'Harry Potter and the Order of the Phoenix', '2003', 'J. K. Rowling'),
('6', 'Harry Potter and the Half-Blood Prince', '2005', 'J. K. Rowling'),
('7', 'Harry Potter and the Deathly Hallows', '2007', 'J. K. Rowling'),
('8', 'The Great Gatsby', '1925', 'F. Scott Fitzgerald'),
('9', 'The Grapes of Wrath', '1939', 'John Steinbeck'),
('10', 'Nineteen Eighty-Four', '1949', 'George Orwell'),
('11', 'Ulysses', '1955', 'Vladimir Nabokov'),
('12', 'Catch-22', '1961', 'Joseph Heller'),
('13', 'The Catcher in the Rye', '1951', 'J. D. Salinger'),
('14', 'Beloved', '1987', 'Toni Morrison'),
('15', 'To Kill a Mockingbird ', '1960', 'Harper Lee'),
('16', 'The Sound and the Fury', '1929', 'William Faulkner'),
('17', 'The Lord of the Rings', '1954', 'J. R. R. Tolkien'),
('18', 'Brave New World', '1932', 'Aldous Huxley'),
('19', 'To the Lighthouse', '1927', 'Virginia Woolf'),
('20', 'Invisible Man', '1947', 'Ralph Ellison'),
('21', 'The Hunger Games', '2008', 'Suzanne Collins'),
('22', 'Gone with the Wind ', '1936', 'Margaret Mitchell'),
('23', 'Jane Eyre', '1847', 'Charlotte Bronte'),
('24', 'On the Road', '1957', 'Jack Kerouac'),
('25', 'Pride and Prejudice', '1813', 'Jane Austen'),
('26', 'Lord of the Flies', '1954', 'William Golding'),
('27', 'Middlemarch', '1872', 'George Eliot'),
('28', 'Anna Karenina', '1873', 'Leo Tolstoy'),
('29', 'Animal Farm', '1945', 'George Orwell'),
('30', 'A Passage to India', '1924', 'E. M. Forster'),
('31', 'In Search of Lost Time', '1913', 'Marcel Proust'),
('32', 'For Whom the Bell Tolls', '1940', 'Ernest Hemingway'),
('33', 'The Chronicles of Narnia', '1950', 'C. S. Lewis'),
('34', 'The Color Purple', '1982', 'Alice
Walker'),
('35', 'Midnight Children', '1981', 'Salman Rushdie'),
('36', 'A Portrait of the Artist as a Young Man', '1916', 'James Joyce'),
('37', 'Winnie-the-Pooh', '1926', 'A. A. Milne'),
('38', 'Heart of Darkness', '1899', 'Joseph Conrad'),
('39', 'Mrs Dalloway', '1925', 'Virginia Woolf'),
('40', 'Slaughterhouse-Five', '1969', 'Kurt Vonnegut'),
('41', 'War and Peace', '1865', 'Leo Tolstoy'),
('42', 'Of Mice and Men', '1937', 'John Steinbeck'),
('43', 'Moby-Dick', '1851', 'Herman Melville'),
('44', 'Little Women ', '1868', 'Louisa May Alcott'),
('45', 'Native Son', '1940', 'Richard Wright'),
('46', 'The Hitchhikers Guide to the Galaxy', '1979', 'Douglas Adams'),
('47', 'Great Expectations', '1860', 'Charles Dickens'),
('48', 'The Sun Also Rises', '1926', 'Ernest Hemingway'),
('49', 'Rebecca', '1938', 'Daphne du Maurier'),
('50', 'The Stranger', '1942', 'Albert Camus');

Insert Into Library.Employee(Id, Name, Date_of_birth, Email)
Values
('1', 'Dmitry', '1991-11-15', 'Dmitry@gmail.ru'),
('2', 'Igor', '1980-01-12', 'Igor@gmail.ru'),
('3', 'Alex', '1992-05-30', 'Alex@mail.ru'),
('4', 'Igor', '1988-06-24', 'Igor88@gmail.ru'),
('5', 'Anna', '1965-02-04', 'Anna@tut.by'),
('6', 'Olga', '1972-03-17', 'Olga@gmail.ru'),
('7', 'Anna', '1996-09-12', 'Anna96@gmail.ru'),
('8', 'Irina', '1983-12-06', 'Irina@gmail.ru'),
('9', 'Darya', '1994-11-21', 'Darya@gmail.ru'),
('10', 'Egor', '1969-01-05', 'Egor@gmail.ru'),
('11', 'Igor', '1964-03-29', 'Igor@mail.ru'),
('12', 'Inna', '1990-03-30', 'Inna@tut.by');