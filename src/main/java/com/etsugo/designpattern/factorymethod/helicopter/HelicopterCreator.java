package com.etsugo.designpattern.factorymethod.helicopter;

import com.etsugo.designpattern.factorymethod.Aircraft;
import com.etsugo.designpattern.factorymethod.AircraftCreator;

public class HelicopterCreator extends AircraftCreator
{

	@Override
	public Aircraft createAircraft() {
		Aircraft aircraft = new Helicopter();
		return aircraft;
	}

}
