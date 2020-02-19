package com.designpatterns.abstractfactory;

public abstract class TextBox {

	private String text;
	private String osType;
	
	public TextBox(String osType) {
		text = "";
		this.osType = osType;
	}
	
	public void setText(String newText) {
		this.text = newText;
		System.out.println(text + " set as text of " + osType);

	}
	
	public String getText() {
		System.out.println(osType + "'tan text isteniyor");
		return this.text;
	}
	
	public void deleteText() {
		System.out.println(text + " delete from " + osType);
		this.text = "";
	}

}
