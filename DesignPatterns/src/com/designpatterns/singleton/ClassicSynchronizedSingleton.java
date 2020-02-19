package com.designpatterns.singleton;

public class ClassicSynchronizedSingleton {
	
	private static ClassicSynchronizedSingleton instance;
    
    private ClassicSynchronizedSingleton(){}
    
    public static  ClassicSynchronizedSingleton getInstance(){
    	
    	synchronized(ClassicSynchronizedSingleton.class) {
	        if(instance == null){
	            instance = new ClassicSynchronizedSingleton();
	        }
        }
        return instance;
    }
}

/*Bu Singleton tasarýmýnýn, ClassicSingleton'dan farký getInstance() metodunun
 * önüne synchronized kelimesinin getirilmesidir. Bu Singleton'ýn Thread-Safe
 * olmasýný saðlamaktadýr. Böylelikle çalýþma zamanýnda sadece bir tane
 * thread ulaþabildiðinden dolayý farklý singleton nesnesinin oluþmamasý saðlanýr.
 * Fakat synchronized bloðunun her seferinde çalýþmasý sebebi ile bu performans
 * kaybýna neden olur ve çok fazla singleton eriþimi varsa uygun olmayabilir.
 */
