package com.bridgelabz.account;

import java.util.Scanner;

public class Account {
	static Scanner sc = new Scanner(System.in);
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void debit(double balance) {
		System.out.println("Enter the amount to withdraw");
		double withdraw = sc.nextDouble();
		if (withdraw > balance)
			System.out.println("Debit amount exceeded account balance.");
		else
			balance = balance - withdraw;
		System.out.println("Thank you for withdrawing " + withdraw);
		System.out.println("Remaining balance is " + balance);
	}

	public static void main(String[] args) {
		System.out.println("Enter the balance in your account");
		Account account = new Account(sc.nextDouble());
		account.debit(account.balance);
	}

}
