package com.designpatterns.singleton;


/*
 * Singleton tasar�m deseninin en basit implementasyonudur
 * Literat�rde Classic Implementation veya Lazy Initialization
 * olarakta bilinmektedir.
 * Bu tip singleton olu�turma metodunda, singleton objesi ilk
 * �a�r�ld���nda yarat�l�r.
 */
public class ClassicSingleton {
	
	private static ClassicSingleton instance;
    
    private ClassicSingleton(){}
    
    public static ClassicSingleton getInstance(){
        if(instance == null){
        	/*Bu try blo�unun ne anlama geldi�i i�in bknz. ClassicSingletonProblem.java
        	 * try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
            instance = new ClassicSingleton();
        }
        return instance;
    }
    
 }


/*
 * Yukar�daki kod �rne�i single thread uygulamalarda iyi �al��maktad�r
 * Fakat multi-thread uygulamalarda problem yaratabilir. �rne�i birden
 * fazla thread oldu�u durumu d���nelim. Bu durumda threadler yukar�daki
 * s�n�f �rne�ini �al��t�rm�� olsun, ayn� anda iki thread getInstance metodunu 
 * �a��r�rsa ikiside instance = new ClassicSingleton() i�erisine girebilir.
 * Bu durumda Singleton i�in iki farkl� �rnek yarat�lm�� olur, ve asl�nda
 * threadler ayn� nesneyi kullanmam�� olurlar ki bu durum Singleton design patterninin
 * mant���na uymaz.
 * */
