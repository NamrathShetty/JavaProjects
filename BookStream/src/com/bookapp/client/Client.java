package com.bookapp.client;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class Client {
	
	public static void main(String[] args) {
	List<Book> book=BookDetails.bookList();
	Scanner scanner=new Scanner(System.in);
	
			
	System.out.println("LIBRARY \n 1.Show all books \n 2.Search Book by Author Name \n 3.Search Book by Category \n"
			+ "4. Search Book by Price \n 5.Search Book by author name and category \n 6. Search Book by ID \n 7.EXIT");
	int choice=scanner.nextInt();
	switch(choice) {
	case 1:{
		book.stream()
		.forEach(System.out::println);
		break;
	}
	case 2:{
		String x=scanner.nextLine();
	System.out.println("Enter the author name");
	String name=scanner.nextLine();
	
	List<Book> bookByAuthor=book.stream()
	.filter(authorName->authorName.getAuthor().equals(name))
	.collect(Collectors.toList());
	
	if(bookByAuthor.isEmpty())
		throw new BookNotFoundException("Book not Found");
	else
		bookByAuthor.forEach(System.out::println);
	break;
	}
	case 3:{
	System.out.println("Enter the category");
	String category=scanner.next();
	
	List<Book> bookByCategory=book.stream()
	.filter(str->str.getCategory().equals(category))
	.collect(Collectors.toList());
	
	if(bookByCategory.isEmpty())
		throw new BookNotFoundException("Book not Found");
	else
		bookByCategory.forEach(System.out::println);
	break;
	}
	case 4:{
	System.out.println("Enter the price");
	double price=scanner.nextDouble();
	
	List<Book> bookByPrice=book.stream()
	.filter(str->str.getPrice()<=price)
	.collect(Collectors.toList());
	
	if(bookByPrice.isEmpty())
		throw new BookNotFoundException("Book not Found");
	else
		bookByPrice.forEach(System.out::println);
	break;
	}
	case 5:{
	System.out.println("Search by author name and category");
	String c=scanner.nextLine();
	System.out.println("Enter the author name");
	String authName=scanner.nextLine();
	System.out.println(" ");
	
	System.out.println("Enter the category");
	
	String bookCategory=scanner.next();
	
	List<Book> bookByAuthorAndCategory=book.stream()
	.filter(str->str.getAuthor().equals(authName) && str.getCategory().equals(bookCategory))
	.collect(Collectors.toList());
	
	if(bookByAuthorAndCategory.isEmpty())
		throw new BookNotFoundException("Book not Found");
	else
		bookByAuthorAndCategory.forEach(System.out::println);
	break;
	}
	case 6:{
	System.out.println("Enter the ID");
	Integer bookId=scanner.nextInt();
	
	List<Book> bookById=book.stream()
	.filter(str->str.getBookId().equals(bookId))
	.collect(Collectors.toList());
	
	if(bookById.isEmpty())
		throw new BookNotFoundException("Book not Found");
	else
		bookById.forEach(System.out::println);
	break;
	}
	default: break;
	}
	}

}
