package com.designpatterns.abstractfactory;

import java.util.Random;

//Burada abstract factory ile programýn çalýtýðý iþletim sistemine göre arayüz bileþenlerini
//oluþturan bir yapý kurulmuþtur
public class AbstractFactoryExample {
	public static String[] osType = {"Linux", "MacOS", "Windows"};
	public static void main(String[] args) {
		//Bunlar javadaki arayüz sýnýflarý deðil bizim yazdýðýmýz örneðe yönelik olan sýnýflardýr.
		Button button;
		ComboBox comboBox;
		TextBox textBox;
		GUIFactory guiFactory;
		//Aþaðýda rastgele bir iþletim sistemi seçimi yapýlmaktadýr.
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
		
		//Nesnelere ait yordamlar çalýþtýrýlýyor.
		
		button.click();
		button.doubleClick();
		button.enterClick();
		
		comboBox.add_item("Java");
		comboBox.add_item("Tasarým");
		comboBox.add_item("Desenleri");
		comboBox.add_item("Dersi");
		
		comboBox.remove_item(2);
		comboBox.show_items();
		
		textBox.setText("Kocaeli Üniversitesi");
		System.out.println("TextBox içerisindeki Deðer: " + textBox.getText());
		
		textBox.deleteText();
		
		
	}

}
