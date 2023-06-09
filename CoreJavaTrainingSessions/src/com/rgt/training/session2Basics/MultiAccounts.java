package com.rgt.training.session2Basics;

import java.util.Scanner;

public class MultiAccounts {

	public static void main(String[] args) {
		
		ATM1 atm = new ATM1();
		BankAccounts bankaccounts= new BankAccounts();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Simple ATM");
            System.out.println("1. Create an Account");
            System.out.println("2. Login Account");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
            
                case 1:
                    System.out.println("Enter User Name: ");
	                String UserName= scanner.next();
	                System.out.println("Enter PIN number: ");
	                int Pin= scanner.nextInt();
	               	bankaccounts.createAccount(UserName, Pin);
	                break;
                case 2:
                    System.out.println("Enter User Account Number: " );
                    int accountNum= scanner.nextInt();
	            	System.out.println("Enter User password: ");
	            	String pswd = scanner.next();
	            	System.out.println("Enter User PIN: ");
	            	Pin= scanner.nextInt();
	            	bankaccounts.loginAccount(accountNum,pswd,Pin);
                    break;
                case 3:
                    System.out.println("Current balance: $" + atm.checkBalance());
                    break;
                case 4:
                	System.out.println("Enter PIN number:     ");
                	 Pin= scanner.nextInt();
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount,Pin);
                    break;
                case 5:
                	System.out.println("Enter PIN number:     ");
               	    Pin= scanner.nextInt();
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount,Pin);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();

        } while (choice != 6);

        scanner.close();
    }
}

		class ATM1 {
    private double balance;

    public ATM1() {
        balance = 0;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount, int pin) {
        if (amount > 0 && pin!=0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount, int pin ) {
    	
        if (amount > balance ) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount<balance && pin!=0){
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }
 }

	class BankAccounts {
		// String[] users= new String[100];
		int[] accnumbers;
		int accountNum=1000;
		int acc_Count;
		public BankAccounts() {
			 accnumbers = new int[1000];
			 acc_Count=0;
		}

		public void createAccount(String userName, int pin) {
			if (pin != 0 && userName != null) {
				System.out.println("Account created successfully-------");
				accountNum = accountNum + 1;
				System.out.println("user accountnumber is: " + accountNum);
			} else {
				System.out.println("Account not created, Please try again with valid information---------");
			}
		}
		
		 public void loginAccount(int AccountNum, String pwd, int pin ) {
		    	if(AccountNum!=0 && pwd!=null && pin!=0) {    		
		    System.out.println("Login Successfull------");
		    	}
		    	else {
		      System.out.println("Please enter valid Credentials----------");
		    	}
		    }
			
		

}