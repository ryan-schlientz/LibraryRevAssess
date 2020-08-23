package com.revature.repositories;

import java.util.List;

import com.revature.models.Book;

public interface BookRepository {
	
	public int addBook(Book b);
	public List<Book> selectAllBooks();
	public Book getBook(int id);
	public void updateBook(Book change);
	public void deleteBook(Book b);

}
