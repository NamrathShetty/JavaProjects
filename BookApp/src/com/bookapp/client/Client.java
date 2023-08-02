package com.bookapp.client;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {
	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		System.out.println(bookService.getAll());
		System.out.println(bookService.getByAuthorContains("John David"));
		System.out.println(bookService.getByAuthorContainsAndCategory("Robin Sharma", "Selfhelp"));
		System.out.println(bookService.getByCategory("Tech"));
		System.out.println(bookService.getById(1));
		
	}
}
