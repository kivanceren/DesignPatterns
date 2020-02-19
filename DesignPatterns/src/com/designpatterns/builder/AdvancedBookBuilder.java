package com.designpatterns.builder;

import java.util.function.Consumer;

public class AdvancedBookBuilder {
	public String bookName;
	public String authorName;
	public String authorSurname;
	public String isbn;
	public int publishedYear;
	public String publisher;
	
	
	public AdvancedBookBuilder(String bookName) {
		this.bookName = bookName;
	}
	
	/*
	 * Not: Aþaðýdaki açýklama https://medium.com/beingprofessional/think-functional-advanced-builder-pattern-using-lambda-284714b85ed5
	 * postundan alýntýlanmýþtýr. AdvancedBookBuilder'da buradaki kod örneðinden esinlenmiþtir.
	 * 
	 * 
	 * "" 
	 * 'With' yöntemi Consumer türünde bir iþlev alýr. 
	 *  Consumer, Java 8 tarafýndan saðlanan ve tek bir argüman alan ve sonuç vermeyen iþlevsel bir arayüzdür.
	 *  Buradaki örnekte 'with' metodu, accept metoduna gönderilecek bir AdvancedBookBuilder parametresi alýr.
	 * 	Bu, builder tipinden bir örneðin lambda ifadeler içerisinden eriþlebileceðine ve istenilen herhangi
	 * 	bir iþlemin gerçekleþtirebileceði anlamýna gelir.
	 * ""
	 * 
	 * AdvancedBookBuilder, BookBuilder ile ayný iþleve sahip fakat çok daha kýsa bir Builder implementasyonudur.
	 *  
	 *  
	 * */
		
	public AdvancedBookBuilder with(
            Consumer<AdvancedBookBuilder> advancedBuilderFunction) {
		advancedBuilderFunction.accept(this);
        return this;
    }

    public Book build() {
    	return new Book(bookName, authorName, authorSurname, isbn, publishedYear, publisher);
    }
		
}
