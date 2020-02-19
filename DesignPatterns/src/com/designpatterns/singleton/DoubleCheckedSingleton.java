package com.designpatterns.singleton;


/*
 * Di�er Singleton �rnekleri incelenirse (ClassicSingleton, ClassicSynchronizedSingleton
 * ve EagerCheckedSingleton) hepsinde b�y�k dezavantajlar� oldu�u g�r�lmektedir.
 * ClassicSingleton -> Multi Threadler i�in problem
 * ClassicSynchronizedSingletion -> Synchronized bir metodu s�rekli �a��rmaktan dolay� d���k performans
 * EagerSingleton -> getInstance() metodunda bir hata yakalama mekanizmas� yok.
 * 
 * Bunun ��z�m� ise sadece bir Singleton objesi ilk kez olu�turulurken
 * Synchronized ile thread-safety yapmak ve daha sonras�nda bir daha
 * synchronized blo�una ihtiya� duymamak �eklinde a��klanabilir.
 */
 

public class DoubleCheckedSingleton {
	private volatile static DoubleCheckedSingleton instance; 
	  
    private DoubleCheckedSingleton() {} 
  
    public static DoubleCheckedSingleton getInstance() 
    { 
        if (instance == null) 
        { 
            // Thread safe i�in gerekli
            synchronized (DoubleCheckedSingleton.class) 
            { 
                // multi thread durumu i�in bir kere daha kontrol
                if (instance == null) 
                	instance = new DoubleCheckedSingleton(); 
            } 
        } 
        return instance; 
    } 
}

/*
 * Yuka�rdaki kod incelenirse getInstance() �a�r�ld���nda nesnenin null olup olmad��� kontrol edilir.
 * ClassicSynchronizedSingleton'da her seferinde synchronized blo�u �a�r�l�yordu. Bunu �nlemek i�in bu synchronized
 * blo�u sadece nesne null olunca �a�r�ls�n istiyoruz. Bu sebeple ClassicSynchronizedSingleton'daki syncronized blo�u
 *  �zerine burada bir if(instance == null) ekleyerek bu ko�ulu sa�lam�� oluyoruz
 * 
 * 
 * Ek NOT: Dikkat edilirse instance nesnesinin ba��na bir volatile i�leci konulmu�tur. Bunun ile ilgili 
 * detayl� bilgiye https://www.geeksforgeeks.org/volatile-keyword-in-java/ 
 * https://www.javatpoint.com/volatile-keyword-in-java
 * adreslerinden ula��labilir. 
 * 
 */