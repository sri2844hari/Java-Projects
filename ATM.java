package AtmApplication;

public class ATM {
	private double balance;
	private double deposit;
	private double withdrawl;
	public ATM() {
		super();
	}
	@Override
	public String toString() {
		return "ATM [balance=" + balance + ", deposit=" + deposit + ", withdrawl=" + withdrawl + "]";
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	
}
