
public class Account {
private double balance;
public Account(double initialBalance) {
	if(initialBalance>0.0)
		balance=initialBalance;
}
public void credit(double amount) {
	balance=balance+amount;
}
public double getBalance() {
	return balance;
}
public void debit(double amount) {
	if(amount>balance) {
		System.out.println("Debit amount axceeded account balance ");
	}else {
		balance=balance-amount;
	}
}
}
