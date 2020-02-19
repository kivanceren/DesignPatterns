package com.designpatterns.singleton;


/*
 * Singleton tasarým deseninin en basit implementasyonudur
 * Literatürde Classic Implementation veya Lazy Initialization
 * olarakta bilinmektedir.
 * Bu tip singleton oluþturma metodunda, singleton objesi ilk
 * çaðrýldýðýnda yaratýlýr.
 */
public class ClassicSingleton {
	
	private static ClassicSingleton instance;
    
    private ClassicSingleton(){}
    
    public static ClassicSingleton getInstance(){
        if(instance == null){
        	/*Bu try bloðunun ne anlama geldiði için bknz. ClassicSingletonProblem.java
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
 * Yukarýdaki kod örneði single thread uygulamalarda iyi çalýþmaktadýr
 * Fakat multi-thread uygulamalarda problem yaratabilir. Örneði birden
 * fazla thread olduðu durumu düþünelim. Bu durumda threadler yukarýdaki
 * sýnýf örneðini çalýþtýrmýþ olsun, ayný anda iki thread getInstance metodunu 
 * çaðýrýrsa ikiside instance = new ClassicSingleton() içerisine girebilir.
 * Bu durumda Singleton için iki farklý örnek yaratýlmýþ olur, ve aslýnda
 * threadler ayný nesneyi kullanmamýþ olurlar ki bu durum Singleton design patterninin
 * mantýðýna uymaz.
 * */
