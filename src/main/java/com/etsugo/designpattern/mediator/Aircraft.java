package com.etsugo.designpattern.mediator;

public class Aircraft implements Component
{
	private AircraftMediator aircraftMediator;

	@Override
	public void setAircraftMediator(AircraftMediator aircraftMediator)
	{
		this.aircraftMediator = aircraftMediator;
	}
	
	public void landingRequest()
	{
		aircraftMediator.landing();
	}

}
