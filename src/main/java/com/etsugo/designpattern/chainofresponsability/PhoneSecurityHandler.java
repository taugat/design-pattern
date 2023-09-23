package com.etsugo.designpattern.chainofresponsability;

import com.etsugo.designpattern.chainofresponsability.other.Phone;

/**
 * Handler class:
 * Check if phone is secured.
 */
public class PhoneSecurityHandler extends PhoneTesterHandler
{

	@Override
	public boolean handle(Phone phone) {
		if (!isSecured(phone))
		{
			return false;
		}
		else
		{
			return handleNext(phone);
		}
	}

	private boolean isSecured(Phone phone)
	{
		//some security checks
		return true;
	}

}
