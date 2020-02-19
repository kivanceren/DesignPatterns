package com.designpatterns.objectpool;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectPool<T> {
	private List<T> usedObjectList;
	private List<T> availableObjectList;
	private int poolSize;
	
	protected abstract T createPoolObject();
	
	public <T> ObjectPool (int poolSize){
		this.poolSize = poolSize;
		availableObjectList = new ArrayList<>(poolSize);
		for(int i = 0 ; i < poolSize; i++) {
			availableObjectList.add(createPoolObject());
		}
		usedObjectList = new ArrayList<>(poolSize);
	}
	
	
	
	public synchronized T getAvailable() {
		if(availableObjectList.isEmpty()) {
			System.out.println("There is no available object in Pool");
			return null;
		}
		T anAvailableObject =  availableObjectList.iterator().next();
		availableObjectList.remove(anAvailableObject);
		usedObjectList.add(anAvailableObject);
		System.out.println("An available object has been reserved");
		return anAvailableObject;
			
	}
	
	
	public synchronized void setFree(T usedObject) {
		usedObjectList.remove(usedObject);
		availableObjectList.add(usedObject);
		System.out.println("An object added to availableObject");
	}
	
	@Override
	public synchronized String toString() {
	    return String.format("Pool availablity=%d object usable=%d object already used", 
	    		availableObjectList.size(), usedObjectList.size());
	}
	
}
