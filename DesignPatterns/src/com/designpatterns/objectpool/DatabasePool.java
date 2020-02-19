package com.designpatterns.objectpool;

public class DatabasePool extends ObjectPool<DBConnection>{

	public DatabasePool(int poolSize) {
		super(poolSize);
	}

	@Override
	protected DBConnection createPoolObject() {
		return new DBConnection();
	}

}
