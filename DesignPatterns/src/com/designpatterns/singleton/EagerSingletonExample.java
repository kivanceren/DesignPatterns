package com.designpatterns.singleton;

public class EagerSingletonExample extends Thread {
	
	 public static void main(String[] args) {
	        for(int i = 0; i < 10; i++){
	            new EagerSingletonExample().start();
	        }
	 }
	     
	 public void run(){
	    EagerSingleton eagerSingleton = EagerSingleton.getInstance();
	    //Her durumda hashcode de�erleri ayn� yani tek bir nesne d�nm��. Thread-Safety
	    System.out.println(eagerSingleton.hashCode());
	 }

}
