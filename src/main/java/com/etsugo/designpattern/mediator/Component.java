package com.etsugo.designpattern.mediator;

/**
 * Component interface:
 * There are several components using the same mediator.
 */
public interface Component
{
	void setAircraftMediator(AircraftMediator aircraftMediator);
}
