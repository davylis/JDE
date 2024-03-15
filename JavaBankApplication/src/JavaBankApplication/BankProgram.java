package JavaBankApplication;

// ************************************************************************
// BankProgram.java	 Template created on 15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BankProgram {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		input.close();
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------"
				+ "---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | "
				+ "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");
		DecimalFormat formatter = new DecimalFormat("0.00");
		for (Account a : accountList) {
			String row = "Number: " + a.getAccountNumber() + " | Balance: " + formatter.format(a.getBalance()) + " euros";
			System.out.println(row);
		}

	}

	private static void addAccount() {
		System.out.print("\n*** Add an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();

		Account account = findAccount(accountNumber);

		if (account != null) {
			System.out.println("\nAccount not created. Account " + accountNumber + " exists already!");
			return;
		}
		
		System.out.println("Create password for an account");
		String password = input.nextLine();
//**
		Account newAccount = new Account(accountNumber, password);
		accountList.add(newAccount);
		System.out.println("\nAccount created successfully!");


		
	}

	// Finds an account in accountList by given account number.
	// Returns either a reference to the account object
	// OR null if the account is not found in accountList.
	private static Account findAccount(String accountNumber) {
		Account myAccount = null;
		for (Account a : accountList) {
			if (a.getAccountNumber().equals(accountNumber)) {
				myAccount = a;
				break;
			}
		}
		return myAccount;
	}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();
		
		Account account = findAccount(accountNumber);

		if (account == null) {
			System.out.println("\nAccount " + accountNumber + " does not exist!");
			return;
		}

		System.out.print("Enter the amount to be deposited: ");
		double amount = Double.parseDouble(input.nextLine());
		if (amount < 0.0) {
			System.out.println("\nCannot deposit a negative amount!");
			return;
		}

		account.deposit(amount);
		System.out.println("\nDeposit completed successfully!");
	}

	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();
		
		Account account = findAccount(accountNumber);

		if (account == null) {
			System.out.println("\nAccount " + accountNumber + " does not exist!");
			return;
		}

		System.out.print("Enter the amount to be withdrawn: ");
		double amount = Double.parseDouble(input.nextLine());
		if (amount < 0.0) {
			System.out.println("\nCannot withdraw a negative amount!");
			return;
		}

		if (account.withdraw(amount)) {
			System.out.println("\nWithdrawal completed successfully!");
		} else {
			System.out.println("\nWithdrawal not completed. Available balance is too low.");
		}
	}

	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();

		Account account = findAccount(accountNumber);

		if (account == null) {
			System.out.println("\nNothing deleted. Account " + accountNumber + " does not exist!");
			return;
		}

		accountList.remove(account);
		System.out.println("\nAccount deleted successfully!");
	}
}
// End
