package com.designpatterns.singleton;

public class ClassicSynchronizedSingletonExample extends Thread {

	 public static void main(String[] args) {
	        for(int i = 0; i < 10; i++){
	            new ClassicSynchronizedSingletonExample().start();
	        }
	 }
	     
	  public void run(){
	    ClassicSynchronizedSingleton classicSyncronizedSingleton = ClassicSynchronizedSingleton.getInstance();
	    //Her durumda hashcode deðerleri ayný yani tek bir nesne dönmüþ
	    System.out.println(classicSyncronizedSingleton.hashCode());
	   }

}
