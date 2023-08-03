package com.bookapp.exception;

public class BookNotFoundException extends RuntimeException {
	public BookNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookNotFoundException(String message) {
		super(message);
	System.out.println(message);
	}

}
