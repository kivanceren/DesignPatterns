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
	 * Not: A�a��daki a��klama https://medium.com/beingprofessional/think-functional-advanced-builder-pattern-using-lambda-284714b85ed5
	 * postundan al�nt�lanm��t�r. AdvancedBookBuilder'da buradaki kod �rne�inden esinlenmi�tir.
	 * 
	 * 
	 * "" 
	 * 'With' y�ntemi Consumer t�r�nde bir i�lev al�r. 
	 *  Consumer, Java 8 taraf�ndan sa�lanan ve tek bir arg�man alan ve sonu� vermeyen i�levsel bir aray�zd�r.
	 *  Buradaki �rnekte 'with' metodu, accept metoduna g�nderilecek bir AdvancedBookBuilder parametresi al�r.
	 * 	Bu, builder tipinden bir �rne�in lambda ifadeler i�erisinden eri�lebilece�ine ve istenilen herhangi
	 * 	bir i�lemin ger�ekle�tirebilece�i anlam�na gelir.
	 * ""
	 * 
	 * AdvancedBookBuilder, BookBuilder ile ayn� i�leve sahip fakat �ok daha k�sa bir Builder implementasyonudur.
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
