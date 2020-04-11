package kay;
import java.util.Scanner;

public class BankAccount {
	
	
		int balance;
		int previousTransaction;
		String CustomerName;
		String CustomerId;
		private Scanner input;
		//initiation of the application variable values
		BankAccount(String cname,String cid){
			CustomerName=cname;
			CustomerId=cid;
		}
		//constructor for the account objects instantiation of account variables
		void deposit(int amount) {
			if (amount!=0) {
				balance= balance+amount;
				previousTransaction=balance;
				//method for deposit that returns new balance after depositing an amount
			}
		}
		void withdraw(int amount) {
			if (amount!=0) {
				balance= balance-amount;
				previousTransaction=-amount;
				//this method returns new balance after withdrawing from the initial amount on the account
			}
		}
		void lastTransaction() {
			if(previousTransaction>0) {
				System.out.println("you deposited "+previousTransaction);
			}
			else if(previousTransaction<0) {
				System.out.println("you withdrew " +Math.abs(previousTransaction));
				//math.abs is a method that returns a positive value regardless of the initial value added with it
				//math.abs is used so that the previous transaction recorded to the user is not a negative
			}
			else {
				System.out.println("no transaction occured!!!");
			}
		}
			
			void showMenu(){
				//this method displays the menu of options for the user to input their options
				char option='\0';
				input = new Scanner(System.in);
				//scanner object helps the user to input a given character as an option
				System.out.println("Welcome " +CustomerName);
				
				System.out.println("account number "+CustomerId);
				//the following are the options that a user may select to make use of the services
				System.out.println("=========================================" );
				System.out.println("A.CHECK BALANCE" );
				System.out.println("B.DEPOSIT" );
				System.out.println("C.WITHDRAW" );
				System.out.println("D.PREVIOUS TRANSACTION" );
				System.out.println("E.EXIT" );
				
				
				do {
				// the do while loop is used to run the program for particular options to use except the unwanted ones.	
					System.out.println("SELECT AN OPTION TO PROCEED" );
					
					System.out.println("=========================================" );
					option=input.next().charAt(0);
					//charAt allows a user to input one character at a time
				
					System.out.println("=========================================" );
					switch(option) {
					//the switch case statement is used in order to switch between the different options and what happens if they are selected
					case 'A':
					System.out.println("\n" );
					System.out.println("your balance is "+ balance );
					System.out.println("\n" );
					break;
					case 'B':
						System.out.println("\n" );
						System.out.println("Enter amount to deposit" );
						System.out.println("\n" );
						int amount=input.nextInt();
						deposit(amount);
						
					break;
					case 'C':
						System.out.println("\n" );
						System.out.println("Enter amount to withdraw" );
						
						System.out.println("\n" );
						int amountTwo=input.nextInt();
						withdraw(amountTwo);
						
					break;
					
					case 'D':
						
						lastTransaction();
						
					break;
					case 'E':
						System.out.println("Hello "+CustomerName );
						break;
					 
					default:
						System.out.println("you entered an invalid option" );
						break;
						
						
					}	
				}
					while(option!='E');
					System.out.println("Thank you for using our Services" );

			}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	BankAccount reagan=new BankAccount("BRINKLEY","U2018-08-03211");
	reagan.showMenu();

}

}
				
					
				
				
				
				
				
				
			
			
		


