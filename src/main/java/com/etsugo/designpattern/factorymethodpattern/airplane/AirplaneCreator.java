package com.etsugo.designpattern.factorymethodpattern.airplane;

import com.etsugo.designpattern.factorymethodpattern.Aircraft;
import com.etsugo.designpattern.factorymethodpattern.AircraftCreator;

public class AirplaneCreator extends AircraftCreator
{

	@Override
	public Aircraft createAircraft() {
		Aircraft aircraft = new Airplane();
		return aircraft;
	}

}
