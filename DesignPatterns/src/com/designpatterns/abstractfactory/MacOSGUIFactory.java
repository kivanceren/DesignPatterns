package com.designpatterns.abstractfactory;

public class MacOSGUIFactory extends GUIFactory {
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new MacOSComboBox();
	}

	@Override
	public TextBox createTextBox() {
		return new MacOSTextBox();
	}
}
