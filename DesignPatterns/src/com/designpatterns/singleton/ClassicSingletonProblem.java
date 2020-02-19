package com.designpatterns.singleton;


/*
 * Burada ClassicSingleton'ýn MultiThread kodlardaki problemi gösterilmiþtir.
 * Eðer tam istenen çýktý alýnamýyorsa ClassicSingleton.java içerisindeki Thread.sleep(1)
 * olan yorum satýrý kaldýrýlabilir. Bu kod ClassicSingleton için birden fazla örneðin
 * yaratýlma ihtimalini arttýrmak içindir.
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
