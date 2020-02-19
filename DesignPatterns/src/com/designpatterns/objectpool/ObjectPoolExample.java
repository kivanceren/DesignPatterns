package com.designpatterns.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPoolExample extends Thread {
	public static DatabasePool dbPool = new DatabasePool(3);
	public static List<DBConnection> dbConnectionObject = new ArrayList<>();
	int id;
	
	public ObjectPoolExample(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		
		//Bu bir multi thread örneðidir
		//5 thread oluþturulu ve bunlar aldýðý pool objesini belli bir süre
		//meþgul tutar.
		for(int i = 0; i < 5; i++) {
			new ObjectPoolExample(i).start();
		}
		
		/*
		//Daha basit bir örnek için aþaðdýdaki kod çalýþtýrýlabilir
		//Fakat yukarýdaki for yorum satýrý içine alýnmalý 
	
		DBConnection dbCon1 = dbPool.getAvailable();
		DBConnection dbCon2 = dbPool.getAvailable();
		DBConnection dbCon3 = dbPool.getAvailable();
		
		//dbCon4 ve dbCon5 için Pool'da müsait obje kalmadýðý için iþlem baþarýsýz
		DBConnection dbCon4 = dbPool.getAvailable();
		DBConnection dbCon5 = dbPool.getAvailable();

		
		//dbCon1 ve dbCon2 Pool'a geri verilsin
		dbPool.setFree(dbCon1);
		dbPool.setFree(dbCon2);
		
		//Þimdi dbCon4 ve dbCon5, yukarýdaki dbCon1 ve dbCon2 serbest býrakýldýðý için
		//yer alýnabiliyor
		dbCon4 = dbPool.getAvailable();
		dbCon5 = dbPool.getAvailable();
		
		*/
		
	}
	

	/*Bir thread ile object pool'dan müsait veri isteniyor. Eðer pool içerisinde uygun bir obje varsa
	bu obje geri döndürülüyor eðer yoksa null döndürülerek ekrana bu durumu bildiren bir bilgi 
	yazdýrýlýyor.
	*/
	@Override
	public void run() {
		for(int i = 0; i < 4; i++ ) {
			DBConnection dbConnection = dbPool.getAvailable();
			//dbConnection alýndýktan sonra belli bir süre o dbConnection objesi meþgul tutuluyor
			try {
				System.out.println("Thread "+id+" uses a DBConnection...");
				Thread.sleep(8000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(dbConnection != null) {
				System.out.println("Thread "+id+" sets free a DBConnection...");
				dbPool.setFree(dbConnection);
			}
		}		
	}
}
