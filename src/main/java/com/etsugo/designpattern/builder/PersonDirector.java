package com.etsugo.designpattern.builder;

/**
 * This class contains some preset methods to avoid code repetition when using builder.
 * Methods parameter can be an interface so it work for all builders that implemented it.
 */
public class PersonDirector
{
	public void boy(PersonBuilder personBuilder)
	{
		personBuilder.sex("M")
			.age(10);
	}
	
	public void oldLady(PersonBuilder personBuilder)
	{
		personBuilder.sex("F")
			.age(90);
	}
}
