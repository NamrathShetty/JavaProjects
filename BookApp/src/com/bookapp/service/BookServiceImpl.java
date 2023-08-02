package com.bookapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

List<Book> books;	


	public BookServiceImpl() {
		books=BookDetails.bookList();
		
	}
	
	@Override
	public List<Book> getAll() {
		return this.books;
		}
	
	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		List<Book> bookByAuthor=new ArrayList<>();
		for(Book book:this.books)
			if(book.getAuthor().equals(author))
				bookByAuthor.add(book);
		if(bookByAuthor.size()==0)
			throw new BookNotFoundException("Book not Found");
		return bookByAuthor;
		
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> bookByAuthor=new ArrayList<>();
		for(Book book:this.books)
			if(book.getCategory().equals(category))
				bookByAuthor.add(book);
		if(bookByAuthor.size()==0)
			throw new BookNotFoundException("Book not Found");
		return bookByAuthor;

	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> bookByAuthor=new ArrayList<>();
		for(Book book:this.books)
			if(book.getPrice()<price) 
				bookByAuthor.add(book);
		if(bookByAuthor.size()==0)
			throw new BookNotFoundException("Book not Found");
		return bookByAuthor;
			
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> bookByAuthor=new ArrayList<>();
		for(Book book:this.books)
			if(book.getAuthor().equals(author) && book.getCategory().equals(category))
				bookByAuthor.add(book);
		if(bookByAuthor.size()==0)
			throw new BookNotFoundException("Book not Found");
		return bookByAuthor;
	}

	@Override
	public Optional<Book> getById(int bookId) throws BookNotFoundException {
		
		Optional<Book> bookById= Optional.of(this.books
				.stream()
				.filter(bId->bId.getBookId().equals(bookId))
				.findAny()
				.orElseThrow(()->new BookNotFoundException("Book not Found")));

		return bookById;
	}

	

}
