package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> bookList(){
		return Arrays.asList(
				new Book("Java in Action","John David","Tech",1,900.90),
				new Book("5 am club","Robin Sharma","Selfhelp",2,300.68),
				new Book("Java in Action","John David","Tech",1,900.90),
				new Book("Java in Action","John David","Tech",1,900.90),
				new Book("Java in Action","John David","Tech",1,900.90),
				new Book("Java in Action","John David","Tech",1,900.90)
				);
	}
}
