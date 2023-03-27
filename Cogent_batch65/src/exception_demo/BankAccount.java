package exception_demo;

import java.util.Scanner;

public class BankAccount {
	int accNum;
	String custName;
	String accType;
	float balance;
	
	public BankAccount(int accNum, String custName, String accType, float initialBalance) throws NegativeAmountException, LowBalanceException{
		if (initialBalance < 0)
			throw new NegativeAmountException("Negative amount not allowed: ");
		this.accNum = accNum;
		this.custName = custName;
		this.accType = accType;
		this.balance = initialBalance;
		System.out.println(this.getBalance());
	}
	
	void deposit(float amt) throws NegativeAmountException {
		if (amt >= 0.0)
			this.balance += amt;
		else
			throw new NegativeAmountException("Negative amount not allowed");
	}
	
	void withdrawal(float amt) throws InsufficientFundsException {
		if (this.balance - amt >= 0)
			this.balance -= amt;
		else
			throw new InsufficientFundsException("You do not have enough funds: " + this.balance);
	}
	
	float getBalance() throws LowBalanceException {
		if (this.balance < 1000f && accType.equals("savings"))
			throw new LowBalanceException("you have a low balance: " + this.balance);
		else if (this.balance < 5000f && accType.equals("current"))
			throw new LowBalanceException("you have a low balance: " + this.balance);
		else {
			System.out.println("Your current balance is: ");
			return this.balance;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		String accType;
		float amt;
		
		try {
			System.out.println("Please enter account id: ");
			id = sc.nextInt();
			System.out.println("Please enter account holder name: ");
			name = sc.next();
			System.out.println("Please enter account type: current or savings");
			accType = sc.next();
			System.out.println("Please enter initial deposit: ");
			amt = sc.nextFloat();
			
			BankAccount account = new BankAccount(id, name, accType, amt);
			System.out.println("Please enter amount to deposit: ");
			amt = sc.nextFloat();
			account.deposit(amt);
			System.out.println("Please enter amount to withdrawal: ");
			amt = sc.nextFloat();
			account.withdrawal(amt);
			System.out.println("Your account balance is: ");
			account.getBalance();
		} catch (NegativeAmountException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (LowBalanceException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (InsufficientFundsException e){
			System.out.println(e.getMessage());		
		}
	}
}
