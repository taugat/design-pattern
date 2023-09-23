package com.etsugo.designpattern.chainofresponsability;

import com.etsugo.designpattern.chainofresponsability.other.Phone;

public abstract class PhoneTesterHandler
{
	private PhoneTesterHandler next;
	
	/**
	 * Handlers can be ordered by this function.
	 * @param next
	 * @return
	 */
	public PhoneTesterHandler setNextHandler(PhoneTesterHandler next)
	{
		this.next = next;
		return next;
	}
	
	/**
	 * Process the request or pass it along the chain
	 * @param phone
	 * @return
	 */
	public abstract boolean handle(Phone phone);
	
	public boolean handleNext(Phone phone)
	{
		if (null != next)
		{
			return next.handle(phone);
		}
		else
		{
			return true;
		}
	}
	
}
