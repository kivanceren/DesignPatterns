package com.designpatterns.builder;

public interface IBuilder {
	public IBuilder setBookName(String bookName);
	
	public IBuilder setAuthorName(String authorName);

	public IBuilder setAuthorSurname(String authorSurname);

	public IBuilder setIsbn(String isbn);

	public IBuilder setPublishedYear(int publishedYear);

	public IBuilder setPublisher(String publisher);
}
