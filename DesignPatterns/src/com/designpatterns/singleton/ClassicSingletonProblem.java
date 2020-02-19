package com.designpatterns.singleton;


/*
 * Burada ClassicSingleton'�n MultiThread kodlardaki problemi g�sterilmi�tir.
 * E�er tam istenen ��kt� al�nam�yorsa ClassicSingleton.java i�erisindeki Thread.sleep(1)
 * olan yorum sat�r� kald�r�labilir. Bu kod ClassicSingleton i�in birden fazla �rne�in
 * yarat�lma ihtimalini artt�rmak i�indir.
 * */
public class ClassicSingletonProblem extends Thread {
	 public static void main(String[] args) {
	        for(int i = 0; i < 10; i++){
	            new ClassicSingletonProblem().start();
	        }
	 }
	     
	  public void run(){
	    ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
	    System.out.println(classicSingleton.hashCode());
	  }

}
