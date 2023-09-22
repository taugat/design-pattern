package com.etsugo.designpattern.factorymethodpattern.helicopter;

import com.etsugo.designpattern.factorymethodpattern.Aircraft;
import com.etsugo.designpattern.factorymethodpattern.AircraftFactory;

public class HelicopterFactory extends AircraftFactory
{

	@Override
	public Aircraft createAircraft() {
		Aircraft aircraft = new Helicopter();
		return aircraft;
	}

}
