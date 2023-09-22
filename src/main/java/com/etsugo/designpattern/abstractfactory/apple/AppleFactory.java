package com.etsugo.designpattern.abstractfactory.apple;

import com.etsugo.designpattern.abstractfactory.ElectronicFactory;
import com.etsugo.designpattern.abstractfactory.Headphone;
import com.etsugo.designpattern.abstractfactory.Phone;

public class AppleFactory extends ElectronicFactory
{

	@Override
	public Phone createPhone()
	{
		return new IPhone();
	}

	@Override
	public Headphone createHeadphone()
	{
		return new AirPods();
	}

}
