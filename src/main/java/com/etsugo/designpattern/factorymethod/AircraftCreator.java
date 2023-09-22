package com.etsugo.designpattern.factorymethod;

import com.etsugo.designpattern.factorymethod.airplane.AirplaneCreator;
import com.etsugo.designpattern.factorymethod.helicopter.HelicopterCreator;

/**
 * Creator class:
 * Single-respossability class : create aircraft, it should not depend of aircraft implementation.
 * Work for any aircraft. Extend this class to implement the construction code of any kind of aircraft.
 */
public abstract class AircraftCreator
{
	/*
	 * The business logic to build any aircraft : create an aircraft, then assemble it.
	 * Respecting Open/Close principle !
	 */
	public Aircraft buildAircraft()
	{
		Aircraft aircraft = createAircraft();
		aircraft.assemble();
		return aircraft;
	}

	/**
	 * The Factory Method:
	 * Use inheritance to let creator's subclasses (as {@link AirplaneCreator}  and {@link HelicopterCreator}) to decide which class to instantiate
	 * Create an object implementing aircraft with its own construction code.
	 * @return the created object
	 */
	public abstract Aircraft createAircraft();
}
