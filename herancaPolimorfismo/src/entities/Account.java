package entities;

public abstract class Account {

	private Integer number; // número
	private String holder; // titular
	protected Double balance; // saldo

	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) { // saque
		balance -= amount + 5.0;
	}

	public void deposit(double amount) { // depósito
		balance += amount;
	}

}
