package com.revature.modeltests;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.revature.models.Book;

@TestInstance(Lifecycle.PER_CLASS)
public class BookTest {

	public static Book book;
	public static Field[] bookFields;
	public static Method[] bookMethods;
	public static List<String> actualFields;
	public static List<String> actualMethods;

	@BeforeAll
	public void setUp() {

		book = new Book();

		bookFields = Book.class.getDeclaredFields();
		bookMethods = Book.class.getDeclaredMethods();

		actualFields = new ArrayList<String>();
		for (Field f : bookFields) {
			actualFields.add(f.getName());
		}

		actualMethods = new ArrayList<String>();
		for (Method f : bookMethods) {
			actualMethods.add(f.getName());
			System.out.println(f.getName());
		}

	}

	@Test
	public void testFields() {

		List<String> expectedFields = new ArrayList<String>(
				Arrays.asList("id", "title", "author", "pages"));

		for (String field : expectedFields) {
			if (!actualFields.contains(field)) {
				Assertions.fail("Book Class does not have field: " + field);
			}
		}
	}
	
	@Test
	public void testMethods() {
		
		List<String> expectedMethods = new ArrayList<String>(
				Arrays.asList("getId", "setId",
						"getTitle", "setTitle",
						"getAuthor", "setAuthor",
						"getPages", "setPages",
						"equals", "hashCode",
						"toString"));
		
		for (String method : expectedMethods) {
			if (!actualMethods.contains(method)) {
				Assertions.fail("Book Class does not have method: " + method);
			}
		}
	}
}
