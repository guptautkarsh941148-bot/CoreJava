package assignment03;

import java.util.Scanner;

class Customer{
	int accountNo;
	double balance;
	double totalSpendings;
	double totalCredits;
	double creditLimit;
	public Customer(int accountNo, double balance, double totalSpendings, double totalCredits, double creditLimit) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.totalSpendings = totalSpendings;
		this.totalCredits = totalCredits;
		this.creditLimit = creditLimit;
	}
	public Customer() {
		
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTotalSpendings() {
		return totalSpendings;
	}
	public void setTotalSpendings(double totalSpendings) {
		this.totalSpendings = totalSpendings;
	}
	public double getTotalCredits() {
		return totalCredits;
	}
	public void setTotalCredits(double totalCredits) {
		this.totalCredits = totalCredits;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Number:");
		accountNo = sc.nextInt();
		System.out.print("Enter the balance:");
		balance = sc.nextDouble();
		System.out.print("Enter the total items charged:");
		totalSpendings = sc.nextDouble();
		System.out.print("Enter the total Credits:");
		totalCredits = sc.nextDouble();
		System.out.println("Enter the Allowed limit:");
		creditLimit = sc.nextDouble();
		
	}
	
	public  boolean isLimitExceeded() {
		double newBalance = balance+totalSpendings - totalCredits;
		System.out.println("New Balance :"+newBalance);
		return newBalance>creditLimit ? true:false;
	}

}
public class Question2 {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.accept();
		if(c1.isLimitExceeded()) {
			System.out.println("Limit Exceeded");
		}
		
	}
		
}