package com.etsugo.designpattern.builder.user;

import com.etsugo.designpattern.builder.PersonBuilder;

/**
 * A concrete PersonBuilder to build a {@link Person}.
 */
public class UserBuilder implements PersonBuilder
{
	private String login;
	private String name;
	private String sex;
	private int age;

	/**
	 * Terminated operation that return the builded object.
	 * @return the builded User.
	 */
	public User build()
	{
		return new User(login, name, sex, age);
	}
	
	public UserBuilder login(String login)
	{
		this.login = login;
		return this;
	}

	@Override
	public PersonBuilder name(String name)
	{
		this.name = name;
		return this;
	}

	@Override
	public PersonBuilder sex(String sex)
	{
		this.sex = sexe;
		return this;
	}

	@Override
	public PersonBuilder age(int age)
	{
		this.age = age;
		return this;
	}
}
