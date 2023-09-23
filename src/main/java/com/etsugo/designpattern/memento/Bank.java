package com.etsugo.designpattern.memento;

import java.util.Deque;
import java.util.LinkedList;

import com.etsugo.designpattern.memento.BankAccount.Memento;

/**
 * Caretaker class:
 * Keeps BankAccount snapshots. Responsible for capturing and restoring BankAccount state.
 */
public class Bank
{
	/**
	 * Account states storage
	 */
	private Deque<Memento> accountStates;
	/**
	 * The current account
	 */
	private BankAccount account;

	public Bank()
	{
		this.accountStates = new LinkedList<>();
		this.account = new BankAccount();
	}
	
	public void addTransaction(int ammount)
	{
		account.applyTransaction(ammount);//The account state change.
		accountStates.add(account.saveState());//we decide to make a new snapshot after the transaction and save it.
	}
	
	public void cancelPreviousTransaction()
	{
		Memento previousAccountState = accountStates.pop();//get the previous state
		account.restore(previousAccountState);//restore account to its previous state
	}
}
