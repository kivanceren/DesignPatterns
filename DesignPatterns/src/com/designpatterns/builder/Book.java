package com.designpatterns.builder;

public class Book {
	
	private final String bookName;
	private  String authorName;
	private  String authorSurname;
	private String isbn;
	private int publishedYear;
	private String publisher;
	
	public Book(String bookName, String authorName, String authorSurname, String isbn, int publishedYear,
			String publisher) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.authorSurname = authorSurname;
		this.isbn = isbn;
		this.publishedYear = publishedYear;
		this.publisher = publisher;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public String getPublisher() {
		return publisher;
	}

	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", authorSurname=" + authorSurname
				+ ", isbn=" + isbn + ", publishedYear=" + publishedYear + ", publisher=" + publisher + "]";
	}

	
	
}
