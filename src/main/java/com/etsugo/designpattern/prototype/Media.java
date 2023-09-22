package com.etsugo.designpattern.prototype;

import com.etsugo.designpattern.prototype.othermodel.Author;
import com.etsugo.designpattern.prototype.othermodel.Carrier;

/**
 * Abstract Prototype class:
 * This class support cloning.
 * We don't know witch class is really implemented when we clone it and we don't have access to inherited class' private attributes.
 * Note that we can also use a Prototype interface with a clone method instead of the abstract method {@link Media#clone()} if we don't deal with inheritance.
 */
public abstract class Media
{
	private String title;
	private Author author;
	private Carrier carrier;
	
	public Media()
	{}
	
	public Media(Media media)
	{
		this.title = media.title;
		
		/* 
		 * Shallow Copy:
		 * Same reference of author
		 * Any change on the author will a be reflected in all cloned classes.
		 */
		this.author = media.author;
		
		/*
		 * Deep Copy:
		 * New instance of carrier
		 * Change of this carrier will not affect the cloned classes.
		 */
		this.carrier = media.carrier.clone();
	}
	
	@Override
	public abstract Media clone();
}
