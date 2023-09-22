package com.etsugo.designpattern.singleton;

/**
 * An example of a singleton.
 * The singleton pattern is used when we need to a unique instance of an object. (e.g. : database instance)
 */
public class Singleton
{
	/*
	 * private so no access from field.
	 * static instance to share the same instance
	 * volatile keyword so Threads don't use cached value but the value directly from the main memory
	 */
	private static volatile Singleton instance;
	
	private String data;
	
	/*
	 * private constructor so access can only be on getInstance function
	 */
	private Singleton(String data) {
		super();
		this.data = data;
	}
	
	/*
	 * static access to the instance
	 */
	public static Singleton getInstance(String data)
	{
		if (instance == null)//Skipping synchronisation if not null => better performance because no waiting sync for the main cases
		{
			synchronized (Singleton.class)//Threads waiting here, multiple threads can enter here.
			{
				if (instance == null)//creating singleton if not constructed yet
				{
					instance = new Singleton(data);//Only one thread will enter here
				}
			}
		}
		
		return instance;
	}
}
