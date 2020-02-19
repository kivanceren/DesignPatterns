package com.designpatterns.abstractfactory;

public class LinuxGUIFactory extends GUIFactory{
	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new LinuxComboBox();
	}

	@Override
	public TextBox createTextBox() {
		return new LinuxTextBox();
	}
}
