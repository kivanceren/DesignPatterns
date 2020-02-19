package com.designpatterns.singleton;

public class EagerSingletonExample extends Thread {
	
	 public static void main(String[] args) {
	        for(int i = 0; i < 10; i++){
	            new EagerSingletonExample().start();
	        }
	 }
	     
	 public void run(){
	    EagerSingleton eagerSingleton = EagerSingleton.getInstance();
	    //Her durumda hashcode deðerleri ayný yani tek bir nesne dönmüþ. Thread-Safety
	    System.out.println(eagerSingleton.hashCode());
	 }

}
