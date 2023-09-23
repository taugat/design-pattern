package com.etsugo.designpattern.chainofresponsability;

import com.etsugo.designpattern.chainofresponsability.other.Phone;
import com.etsugo.designpattern.chainofresponsability.other.PhoneRegistry;

/**
 * Handler class:
 * check if phones are registered.
 */
public class PhoneRegisteredHandler extends PhoneTesterHandler
{

	private PhoneRegistry phoneRegistry;
	
	public PhoneRegisteredHandler(PhoneRegistry phoneRegistry)
	{
		this.phoneRegistry = phoneRegistry;
	}

	@Override
	public boolean handle(Phone phone)
	{
		if (!phoneRegistry.isRegistered(phone))
		{
			return false;
		}
		return handleNext(phone);
	}

}
