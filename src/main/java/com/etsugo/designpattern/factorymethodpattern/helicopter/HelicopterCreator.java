package com.etsugo.designpattern.factorymethodpattern.helicopter;

import com.etsugo.designpattern.factorymethodpattern.Aircraft;
import com.etsugo.designpattern.factorymethodpattern.AircraftCreator;

public class HelicopterCreator extends AircraftCreator
{

	@Override
	public Aircraft createAircraft() {
		Aircraft aircraft = new Helicopter();
		return aircraft;
	}

}
