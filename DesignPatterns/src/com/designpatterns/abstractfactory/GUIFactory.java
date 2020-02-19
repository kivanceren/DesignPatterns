package com.designpatterns.abstractfactory;

public abstract class GUIFactory {
	public abstract Button createButton();
	public abstract ComboBox createComboBox();
	public abstract TextBox createTextBox();
}
