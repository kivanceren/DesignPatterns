package com.designpatterns.singleton;


/*
 * Diðer Singleton örnekleri incelenirse (ClassicSingleton, ClassicSynchronizedSingleton
 * ve EagerCheckedSingleton) hepsinde büyük dezavantajlarý olduðu görülmektedir.
 * ClassicSingleton -> Multi Threadler için problem
 * ClassicSynchronizedSingletion -> Synchronized bir metodu sürekli çaðýrmaktan dolayý düþük performans
 * EagerSingleton -> getInstance() metodunda bir hata yakalama mekanizmasý yok.
 * 
 * Bunun çözümü ise sadece bir Singleton objesi ilk kez oluþturulurken
 * Synchronized ile thread-safety yapmak ve daha sonrasýnda bir daha
 * synchronized bloðuna ihtiyaç duymamak þeklinde açýklanabilir.
 */
 

public class DoubleCheckedSingleton {
	private volatile static DoubleCheckedSingleton instance; 
	  
    private DoubleCheckedSingleton() {} 
  
    public static DoubleCheckedSingleton getInstance() 
    { 
        if (instance == null) 
        { 
            // Thread safe için gerekli
            synchronized (DoubleCheckedSingleton.class) 
            { 
                // multi thread durumu için bir kere daha kontrol
                if (instance == null) 
                	instance = new DoubleCheckedSingleton(); 
            } 
        } 
        return instance; 
    } 
}

/*
 * Yukaýrdaki kod incelenirse getInstance() çaðrýldýðýnda nesnenin null olup olmadýðý kontrol edilir.
 * ClassicSynchronizedSingleton'da her seferinde synchronized bloðu çaðrýlýyordu. Bunu önlemek için bu synchronized
 * bloðu sadece nesne null olunca çaðrýlsýn istiyoruz. Bu sebeple ClassicSynchronizedSingleton'daki syncronized bloðu
 *  üzerine burada bir if(instance == null) ekleyerek bu koþulu saðlamýþ oluyoruz
 * 
 * 
 * Ek NOT: Dikkat edilirse instance nesnesinin baþýna bir volatile iþleci konulmuþtur. Bunun ile ilgili 
 * detaylý bilgiye https://www.geeksforgeeks.org/volatile-keyword-in-java/ 
 * https://www.javatpoint.com/volatile-keyword-in-java
 * adreslerinden ulaþýlabilir. 
 * 
 */