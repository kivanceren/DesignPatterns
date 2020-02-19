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
 * Bu singleton Eager Initialization olarak geçer. instance objesinin 
 * static final olmasý sayesinde class loading esnasýnda yani daha proje ilk
 * çalýþýr çalýþmaz bu nesne yaratýlýr. Dolayýsýyla thread-safe olur.
 * Eðer bir singleton çok fazla kaynak (resource) kullanmýyorsa, thread-safety için
 * en basit yol olarak tasarlanabilir. Fakat genel bir singleton çok fazla kaynak
 * (File System, Database baðlantýlarý gibi) kullandýðýndan problem olabilir.
 * Ayrýca dikkat edilirse getInstance metodu herhangi bir hata ayýklama mekanizmasý 
 * olmamasýda bir dezavantaj oluþturur
 * 
 */