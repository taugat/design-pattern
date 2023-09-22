package com.etsugo.designpattern.factorymethodpattern;

import com.etsugo.designpattern.factorymethodpattern.airplane.AirplaneFactory;
import com.etsugo.designpattern.factorymethodpattern.helicopter.HelicopterFactory;

/**
 * Creator class:
 * Single-respossability class : create aircraft, it should not depend of aircraft implementation.
 * Work for any aircraft. Extend this class to implement the construction code of any kind of aircraft.
 */
public abstract class AircraftFactory
{
	/*
	 * The logic to build any aircraft : create an aircraft, then assemble it.
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
	 * Use inheritance to let creator's subclasses (as {@link AirplaneFactory}  and {@link HelicopterFactory}) to decide which class to instantiate
	 * Create an object implementing aircraft with its own construction code.
	 * @return the created object
	 */
	public abstract Aircraft createAircraft();
}
