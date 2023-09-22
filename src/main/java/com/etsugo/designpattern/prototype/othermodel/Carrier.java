package com.etsugo.designpattern.prototype.othermodel;

public class Carrier
{
	@Override
	public Carrier clone()
	{
		return new Carrier();
	}
}
