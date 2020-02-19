package com.designpatterns.singleton;

public class DoubleCheckSingletonExample extends Thread {

	 public static void main(String[] args) {
	        for(int i = 0; i < 10; i++){
	            new DoubleCheckSingletonExample().start();
	        }
	 }
	     
	 public void run(){
	    DoubleCheckedSingleton doubleCheckedSingleton = DoubleCheckedSingleton.getInstance();
	    //Her durumda hashcode de�erleri ayn� yani tek bir nesne d�nm��. Thread-Safety
	    System.out.println(doubleCheckedSingleton.hashCode());
	 }

}
