package com.etsugo.designpattern.builder;

import com.etsugo.designpattern.builder.user.User;
import com.etsugo.designpattern.builder.user.UserBuilder;

/**
 * A builder that can be used to build any class with person's attribute. Use an interface builder when several 'buildable' class share common attributes.
 * Here {@link User} and Employee share common attributes so {@link UserBuilder} and EmployeeBuilder implement this interface.
 */
public interface PersonBuilder
{
	PersonBuilder name(String name);
	PersonBuilder sex(String sex);
	PersonBuilder age(int age);
	//... many other characteristics of a person
}
