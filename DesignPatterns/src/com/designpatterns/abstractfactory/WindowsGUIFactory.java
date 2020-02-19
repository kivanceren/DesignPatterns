package com.designpatterns.abstractfactory;

public class WindowsGUIFactory extends GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new WindowsComboBox();
	}

	@Override
	public TextBox createTextBox() {
		return new WindowsTextBox();
	}
	

}
