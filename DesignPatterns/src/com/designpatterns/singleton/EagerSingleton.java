package com.designpatterns.singleton;

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}

/*
 * Bu singleton Eager Initialization olarak ge�er. instance objesinin 
 * static final olmas� sayesinde class loading esnas�nda yani daha proje ilk
 * �al���r �al��maz bu nesne yarat�l�r. Dolay�s�yla thread-safe olur.
 * E�er bir singleton �ok fazla kaynak (resource) kullanm�yorsa, thread-safety i�in
 * en basit yol olarak tasarlanabilir. Fakat genel bir singleton �ok fazla kaynak
 * (File System, Database ba�lant�lar� gibi) kulland���ndan problem olabilir.
 * Ayr�ca dikkat edilirse getInstance metodu herhangi bir hata ay�klama mekanizmas� 
 * olmamas�da bir dezavantaj olu�turur
 * 
 */