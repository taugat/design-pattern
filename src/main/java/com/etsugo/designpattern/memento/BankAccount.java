package com.etsugo.designpattern.memento;

/**
 * Originator class:
 * Produces snapshot of its state. The implementation is private and should not be revealed to others.
 * Restores its state from a snapshot.
 */
public class BankAccount
{
	/**
	 * private access the current ammount of the account
	 */
	private int ammount;
	
	public void applyTransaction(int ammount)
	{
		this.ammount += ammount;
	}
	
	/**
	 * Create a snapshot.
	 * @return a Memento with the current class state.
	 */
	public Memento saveState()
	{
		return new Memento(ammount);
	}
	
	/**
	 * Restore a previous snapshot.
	 * @param memento with the state to restore.
	 */
	public void restore(Memento memento)
	{
		this.ammount = memento.getSavedAmmount();//access to Memento private methods
	}
	
	/**
	 * Memento class:
	 * Contains a state of BankAccount. Better to be immutable because no needs to modify it.
	 */
	public static class Memento
	{
		/*
		 * Same attributes as the BankAccount.
		 */
		private final int ammount;
		
		/**
		 * A private access to constructor, so only BankAccount is responsible to instantiate memento.
		 * @param ammountToSave
		 */
		private Memento(int ammountToSave)
		{
			ammount = ammountToSave;
		}
		
		private int getSavedAmmount()
		{
			return ammount;
		}
	}
}
