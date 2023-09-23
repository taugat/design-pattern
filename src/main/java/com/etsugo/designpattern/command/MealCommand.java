package com.etsugo.designpattern.command;

/**
 * Concrete command
 */
public class MealCommand implements Command
{
	private Cook cook;
	
	public MealCommand(Cook cook)
	{
		super();
		this.cook = cook;
	}

	@Override
	public void execute()
	{
		cook.prepareMeal();
	}
	
}
