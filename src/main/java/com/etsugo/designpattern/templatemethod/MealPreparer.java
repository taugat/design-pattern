package com.etsugo.designpattern.templatemethod;

/**
 * Abstract class that declares steps and the template method.
 * Extend this class to have some concrete meal preparer.
 */
public abstract class MealPreparer
{
	/**
	 * Template method:
	 * Invoke all Meal preparation steps ordered
	 */
	public void prepareMeal()
	{
		prepareIngredients();
		cookIngredients();
		presenteMeal();
	}

	/*
	 * Step methods ...
	 */
	
	/**
	 * Default step implementation, override it if the presenteMeal step required another/additional implementation
	 */
	public void presenteMeal()
	{
		//Put ingredients on a plate
	}

	protected abstract void cookIngredients();

	protected abstract void prepareIngredients();

}
