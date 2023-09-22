package com.etsugo.designpattern.factorymethod.airplane;

import com.etsugo.designpattern.factorymethod.Aircraft;
import com.etsugo.designpattern.factorymethod.AircraftCreator;

public class AirplaneCreator extends AircraftCreator
{

	@Override
	public Aircraft createAircraft() {
		Aircraft aircraft = new Airplane();
		return aircraft;
	}

}
