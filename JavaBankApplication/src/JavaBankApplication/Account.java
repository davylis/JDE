package JavaBankApplication;

// ************************************************************************
// Account.java	  Template created on15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields
	private String accountNumber;
	private double balance;
	private String password;

//**
	// Constructor
	public Account(String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		this.password = password;
	}
	// Methods

	public void deposit(double amount) {
		System.out.println("Enter password: ");
		if (checkPassword(password)) {
			this.balance += amount;
		} else {
			System.out.println("Wrong password!");
		}

	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean withdraw(double amount) {
		if (this.balance - amount < 0.0)
			return false;

		System.out.println("Enter password: ");
		if (checkPassword(password)) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	private boolean checkPassword(String password) {
		if (password.equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}
}
// End