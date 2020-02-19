package com.designpatterns.builder;

public class BookBuilderExample {

	public static void main(String[] args) {
		Book aBook1 = new BookBuilder("Y�ld�z Gezgini")
				.setAuthorName("Jack")
				.setAuthorSurname("London")
				.setIsbn("6053322863")
				//Orjinal y�l 1915
				.setPublishedYear(2019) 
				.setPublisher("�� Bankas� Yay�nc�l�k")
				.build();
		
		System.out.println(aBook1.toString());
		
		Book aBook2 = new BookBuilder("Beyaz Geceler")
				.setAuthorName("Dostoyevski")
				.setPublishedYear(1848)
				.build();
		
		System.out.println(aBook2.toString());
	
	
		//Advanced Book Builder, Builder Tasar�m Deseninin Lambda ifadeler ile ger�eklenmi� halidir
		//Temel amac� Builder'�n kodu uzatmas� dezavantaj�ndan kurtulmakt�r.
		//Bu �rnek i�in Advanced Book Builder dosyas�na bak�n�z.
		Book aBook3 = new AdvancedBookBuilder("AdvancedBookBuilder")
		        .with(advancedBuilder -> {
		        	advancedBuilder.authorName = "Example";
		        	advancedBuilder.isbn = "451564874541";
		        }).build();
		
		
		System.out.println(aBook3.toString());

	
	}

}
