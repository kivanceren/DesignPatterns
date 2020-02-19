package com.designpatterns.singleton;

public class ClassicSynchronizedSingletonExample extends Thread {

	 public static void main(String[] args) {
	        for(int i = 0; i < 10; i++){
	            new ClassicSynchronizedSingletonExample().start();
	        }
	 }
	     
	  public void run(){
	    ClassicSynchronizedSingleton classicSyncronizedSingleton = ClassicSynchronizedSingleton.getInstance();
	    //Her durumda hashcode de�erleri ayn� yani tek bir nesne d�nm��
	    System.out.println(classicSyncronizedSingleton.hashCode());
	   }

}
