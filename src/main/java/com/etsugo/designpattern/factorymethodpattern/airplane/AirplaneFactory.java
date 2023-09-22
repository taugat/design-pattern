package com.etsugo.designpattern.factorymethodpattern.airplane;

import com.etsugo.designpattern.factorymethodpattern.Aircraft;
import com.etsugo.designpattern.factorymethodpattern.AircraftFactory;

public class AirplaneFactory extends AircraftFactory
{

	@Override
	public Aircraft createAircraft() {
		Aircraft aircraft = new Airplane();
		return aircraft;
	}

}
