package com.etsugo.designpattern.prototype;

/**
 * Prototype class
 */
public class Book extends Media
{
	private int nbPages;
	
	public Book()
	{}
	
	public Book(Book book)
	{
		//Call the parent constructor, the handle itself the cloning of its private fields
		super(book);
		this.nbPages = book.nbPages;
	}

	@Override
	public Book clone() {
		return new Book(this);
	}
}
