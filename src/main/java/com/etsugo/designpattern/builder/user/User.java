package com.etsugo.designpattern.builder.user;

/**
 * This class contains a lot of fields that need to be defined.
 */
public class User
{
	private String login;
	private String name;
	private String sex;
	private int age;
	
	/**
	 * A package-private constructor, so we need to use UserBuilder to instantiate this class.
	 * @param login
	 * @param name
	 * @param sexe
	 * @param age
	 */
	User(String login, String name, String sex, int age)
	{
		this.login = login;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//getters and setters...
	
}
