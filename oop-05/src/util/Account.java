package util;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.holder = name;
	}
	
	public String getName() {
		return holder;
	}
	
	public double getHoulder() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}
