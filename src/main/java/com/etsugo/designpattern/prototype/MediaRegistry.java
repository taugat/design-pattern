package com.etsugo.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype Registry:
 * Contains frequently accessed prototypes.
 * This class is usually use as a factory class.
 */
public class MediaRegistry
{
	private Map<String, Media> cache = new HashMap<>();
	
	public MediaRegistry()
	{
		Book harrypotter = new Book();
		// populate
		cache.put("Harry Potter", harrypotter);
		
		//... some other instance of media to put in cache ...
	}
	
	public Media get(String mediaKey)
	{
		return cache.get(mediaKey).clone();
	}
}
