package com.etsugo.designpattern.command;

/**
 * Invoker class:
 * responsible for initiating requests
 */
public class Waiter
{
	private Command command;
	
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void executeCommand()
	{
		command.execute();
	}
}
