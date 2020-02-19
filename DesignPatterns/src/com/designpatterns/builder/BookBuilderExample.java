package com.designpatterns.builder;

public class BookBuilderExample {

	public static void main(String[] args) {
		Book aBook1 = new BookBuilder("Yýldýz Gezgini")
				.setAuthorName("Jack")
				.setAuthorSurname("London")
				.setIsbn("6053322863")
				//Orjinal yýl 1915
				.setPublishedYear(2019) 
				.setPublisher("Ýþ Bankasý Yayýncýlýk")
				.build();
		
		System.out.println(aBook1.toString());
		
		Book aBook2 = new BookBuilder("Beyaz Geceler")
				.setAuthorName("Dostoyevski")
				.setPublishedYear(1848)
				.build();
		
		System.out.println(aBook2.toString());
	
	
		//Advanced Book Builder, Builder Tasarým Deseninin Lambda ifadeler ile gerçeklenmiþ halidir
		//Temel amacý Builder'ýn kodu uzatmasý dezavantajýndan kurtulmaktýr.
		//Bu örnek için Advanced Book Builder dosyasýna bakýnýz.
		Book aBook3 = new AdvancedBookBuilder("AdvancedBookBuilder")
		        .with(advancedBuilder -> {
		        	advancedBuilder.authorName = "Example";
		        	advancedBuilder.isbn = "451564874541";
		        }).build();
		
		
		System.out.println(aBook3.toString());

	
	}

}
