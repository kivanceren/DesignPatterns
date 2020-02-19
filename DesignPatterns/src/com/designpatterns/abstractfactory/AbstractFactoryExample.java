package com.designpatterns.abstractfactory;

import java.util.Random;

//Burada abstract factory ile program�n �al�t��� i�letim sistemine g�re aray�z bile�enlerini
//olu�turan bir yap� kurulmu�tur
public class AbstractFactoryExample {
	public static String[] osType = {"Linux", "MacOS", "Windows"};
	public static void main(String[] args) {
		//Bunlar javadaki aray�z s�n�flar� de�il bizim yazd���m�z �rne�e y�nelik olan s�n�flard�r.
		Button button;
		ComboBox comboBox;
		TextBox textBox;
		GUIFactory guiFactory;
		//A�a��da rastgele bir i�letim sistemi se�imi yap�lmaktad�r.
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(3);
		String currentOSType = osType[randomInt];
				
		if(currentOSType.equals("Linux")) {
			guiFactory = new LinuxGUIFactory();
		}else if(currentOSType.equals("MacOS")) {
			guiFactory = new MacOSGUIFactory();
		}else {//Windows olma durumu
			guiFactory = new WindowsGUIFactory();
		}
		
		button = guiFactory.createButton();
		comboBox = guiFactory.createComboBox();
		textBox = guiFactory.createTextBox();
		
		//Nesnelere ait yordamlar �al��t�r�l�yor.
		
		button.click();
		button.doubleClick();
		button.enterClick();
		
		comboBox.add_item("Java");
		comboBox.add_item("Tasar�m");
		comboBox.add_item("Desenleri");
		comboBox.add_item("Dersi");
		
		comboBox.remove_item(2);
		comboBox.show_items();
		
		textBox.setText("Kocaeli �niversitesi");
		System.out.println("TextBox i�erisindeki De�er: " + textBox.getText());
		
		textBox.deleteText();
		
		
	}

}
