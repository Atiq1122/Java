import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		System.out.println("Account1 balance:" + account1.getBalance());
		System.out.println("Account2 balance:" + account2.getBalance());
		Scanner input = new Scanner(System.in);
		double depositAmount;
		double withdrawAmount;
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
	//	System.out.println("\n account1 balance:" + depositAmount);
		account1.credit(depositAmount);
		System.out.println("Account1 balance: " + account1.getBalance());
		System.out.println("Account2 balance: " + account2.getBalance());
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.println("Account1 balance:" + account1.getBalance());
		account2.credit(depositAmount);
		System.out.println("Acount2 balance:" + account2.getBalance());
		System.out.println("Enter Amount you want to withdraw: ");
		withdrawAmount=input.nextDouble();
		account1.debit(withdrawAmount);
		System.out.println("Account1 balance: " + account1.getBalance());
		input.close();
		
	}
}
