package com.etsugo.designpattern.mediator;

/**
 * A possible implementation for the AircraftMediator, define a way for components to communicate.
 */
public class ControlTower implements AircraftMediator
{
	//Fields for aircrafts / landing strips...
	
	@Override
	public void landing()
	{
		//Validate landing request
		//Can execute method on other components
	}

}
