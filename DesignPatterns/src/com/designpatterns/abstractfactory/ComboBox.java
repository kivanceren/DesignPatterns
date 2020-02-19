package com.designpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class ComboBox {
	private List<String> itemList;
	private String osType;
	
	public ComboBox(String osType) {
		this.osType = osType;
		itemList = new ArrayList<String>();
	}

	public void add_item(String item) {
		System.out.println(item  + " added to" + osType);
		itemList.add(item);
	}

	public void remove_item(int itemIndex) {
		System.out.println(itemList.get(itemIndex) + " removed from "+ osType +" itemList");
		if(itemList.size() > itemIndex) itemList.remove(itemIndex);
	}

	public void show_items() {
		for(int i = 0; i < itemList.size() ; i++) {
			System.out.println(osType + " Item " + i + " is " + itemList.get(i));
		}
	}
}
