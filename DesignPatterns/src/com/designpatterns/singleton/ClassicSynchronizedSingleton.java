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

/*Bu Singleton tasar�m�n�n, ClassicSingleton'dan fark� getInstance() metodunun
 * �n�ne synchronized kelimesinin getirilmesidir. Bu Singleton'�n Thread-Safe
 * olmas�n� sa�lamaktad�r. B�ylelikle �al��ma zaman�nda sadece bir tane
 * thread ula�abildi�inden dolay� farkl� singleton nesnesinin olu�mamas� sa�lan�r.
 * Fakat synchronized blo�unun her seferinde �al��mas� sebebi ile bu performans
 * kayb�na neden olur ve �ok fazla singleton eri�imi varsa uygun olmayabilir.
 */
