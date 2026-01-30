package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.InsufficientLimitException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();

		System.out.print("Inicial balance: $");
		double balance = sc.nextDouble();

		System.out.print("Withdraw limit: $");
		double withdrawLimit = sc.nextDouble();
		System.out.println();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.print("Enter amount for withdraw: $");
		double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.println("New balance: $" + String.format("%,.2f", account.getBalance()));
		} catch (InsufficientBalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (InsufficientLimitException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
