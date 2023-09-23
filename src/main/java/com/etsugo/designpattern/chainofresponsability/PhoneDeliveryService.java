package com.etsugo.designpattern.chainofresponsability;

import com.etsugo.designpattern.chainofresponsability.other.Phone;

public class PhoneDeliveryService
{
	/**
	 * First (or any) handler of the chain.
	 */
	private PhoneTesterHandler phoneTesterHandler;

	public PhoneDeliveryService(PhoneTesterHandler phoneTesterHandler) 
	{
		this.phoneTesterHandler = phoneTesterHandler;
	}
	
	/**
	 * Deliver the phone if its respect all requirements.
	 * @param phone
	 * @return
	 */
	public boolean deliver(Phone phone)
	{
		//Execute handlers
		if (phoneTesterHandler.handle(phone))
		{
			//The phone has authorization to be deliver
			
			return true;
		}
		else
		{
			return false;
		}
	}
}
