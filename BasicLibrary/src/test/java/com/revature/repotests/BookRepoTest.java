package com.revature.repotests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.revature.models.Book;
import com.revature.repositories.BookRepository;
import com.revature.repositories.BookRepositoryImpl;

@TestInstance(Lifecycle.PER_CLASS)
public class BookRepoTest {
	
	public static long testTime = 0;

	public static BookRepository bookRepo;
	public static Book bAdded = null;
	public static Book bGet = null;
	public static Book bUpdate = null;
	public static Book bDelete = null;
	
	/*
	@BeforeAll
	public void setUp() {
		
		testTime = System.currentTimeMillis();
		
		bookRepo = new BookRepositoryImpl();
		
		bGet = new Book("Book1_" + testTime, "Author1", 101);
		bGet.setId(bookRepo.addBook(bGet));
		
		bUpdate = new Book("Book2_" + testTime, "Author2", 102);
		bUpdate.setId(bookRepo.addBook(bUpdate));
		
		bDelete = new Book("Book3_" + testTime, "Author3", 103);
		bDelete.setId(bookRepo.addBook(bDelete));
	}
	
	@Test
	public void addBook() {
		
		Book b = new Book("Dracula_" + testTime, "Bram Stoker", 200);
		b.setId(bookRepo.addBook(b));
		bAdded = b;
		
		Assertions.assertEquals(
				new Book(b.getId(), "Dracula_" + testTime, "Bram Stoker", 200), b);
	}
	
	@Test
	public void getBook() {
		Assertions.assertEquals(bookRepo.getBook(bGet.getId()),
				new Book(bGet.getId(), "Book1_" + testTime, "Author1", 101));
	}
	@Test
	public void updateBook() {
		bUpdate.setAuthor("TestAuthorChange");
		bUpdate.setPages(1000);
		bookRepo.updateBook(bUpdate);
		
		Assertions.assertEquals(bookRepo.getBook(bUpdate.getId()),
				new Book(bUpdate.getId(), "Book2_" + testTime, "TestAuthorChange", 1000));
	}
	@Test
	public void deleteBook() {
		bookRepo.deleteBook(bDelete);
		Assertions.assertNull(bookRepo.getBook(bDelete.getId()));
	}
	
	@AfterAll
	public void tearDown() {
		bookRepo.deleteBook(bAdded);
		bookRepo.deleteBook(bGet);
		bookRepo.deleteBook(bUpdate);
		if(bookRepo.getBook(bDelete.getId()) != null) {
			bookRepo.deleteBook(bDelete);
		}
	}
	*/

}
