package com.designpatterns.builder;

import java.util.function.Consumer;

public class BookBuilder implements IBuilder{
	
	private  String bookName;
	private  String authorName;
	private  String authorSurname;
	private String isbn;
	private int publishedYear;
	private String publisher;
		
	public BookBuilder(String bookName) {
		this.bookName = bookName;
	}


	public BookBuilder setBookName(String bookName) {
		this.bookName = bookName;
		return this;
	}


	public BookBuilder setAuthorName(String authorName) {
		this.authorName = authorName;
		return this;
	}


	public BookBuilder setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
		return this;
	}


	public BookBuilder setIsbn(String isbn) {
		this.isbn = isbn;		
		return this;
	}


	public BookBuilder setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
		return this;
	}


	public BookBuilder setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}
	
	
	public Book build() {
		return new Book(bookName, authorName, authorSurname, isbn, publishedYear, publisher);
	}
	
	
	public BookBuilder with(
            Consumer<BookBuilder> advancedBuilderFunction) {
		advancedBuilderFunction.accept(this);
        return this;
    }
	

}
