package com.etsugo.designpattern.abstractfactory;

import com.etsugo.designpattern.abstractfactory.apple.AppleFactory;
import com.etsugo.designpattern.factorymethod.AircraftCreator;

/**
 * Abstract Factory class :
 * A factory class let us work with various families of related products.
 * Here, electronic factory can create different kind of electronic components: {@link Phone} and {@link Headphone}.
 * As for {@link AircraftCreator#createAircraft() factory method}, a factory method can be extended by any kind of factory.
 * Extend this class to implement Factory Methods in a concrete factory class as {@link AppleFactory}.
 */
public abstract class ElectronicFactory
{
	//business logic code here
	
	public abstract Phone createPhone();
	
	public abstract Headphone createHeadphone();
}
