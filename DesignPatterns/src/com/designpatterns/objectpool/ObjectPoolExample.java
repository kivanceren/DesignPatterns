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
		
		//Bu bir multi thread �rne�idir
		//5 thread olu�turulu ve bunlar ald��� pool objesini belli bir s�re
		//me�gul tutar.
		for(int i = 0; i < 5; i++) {
			new ObjectPoolExample(i).start();
		}
		
		/*
		//Daha basit bir �rnek i�in a�a�d�daki kod �al��t�r�labilir
		//Fakat yukar�daki for yorum sat�r� i�ine al�nmal� 
	
		DBConnection dbCon1 = dbPool.getAvailable();
		DBConnection dbCon2 = dbPool.getAvailable();
		DBConnection dbCon3 = dbPool.getAvailable();
		
		//dbCon4 ve dbCon5 i�in Pool'da m�sait obje kalmad��� i�in i�lem ba�ar�s�z
		DBConnection dbCon4 = dbPool.getAvailable();
		DBConnection dbCon5 = dbPool.getAvailable();

		
		//dbCon1 ve dbCon2 Pool'a geri verilsin
		dbPool.setFree(dbCon1);
		dbPool.setFree(dbCon2);
		
		//�imdi dbCon4 ve dbCon5, yukar�daki dbCon1 ve dbCon2 serbest b�rak�ld��� i�in
		//yer al�nabiliyor
		dbCon4 = dbPool.getAvailable();
		dbCon5 = dbPool.getAvailable();
		
		*/
		
	}
	

	/*Bir thread ile object pool'dan m�sait veri isteniyor. E�er pool i�erisinde uygun bir obje varsa
	bu obje geri d�nd�r�l�yor e�er yoksa null d�nd�r�lerek ekrana bu durumu bildiren bir bilgi 
	yazd�r�l�yor.
	*/
	@Override
	public void run() {
		for(int i = 0; i < 4; i++ ) {
			DBConnection dbConnection = dbPool.getAvailable();
			//dbConnection al�nd�ktan sonra belli bir s�re o dbConnection objesi me�gul tutuluyor
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
