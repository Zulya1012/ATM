import java.util.Scanner;

public class Account1 {
  private double balance;

  public Account1() {
    balance = 0.0;
  }

  public Account1(double Balance) {
    this.balance = Balance;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double newBalance) {
    this.balance = newBalance;
  }

  public void deposit(double amount) throws Exception {
    if (amount > 0) {
      balance = balance + amount;
      System.out.println("Deposit of " + amount + " successful");
    } else {
      throw new Exception("Invalid amount for deposit");
    }
  }

  public void withDraw(double amount) throws Exception {
    if (amount > 0 && amount <= balance) {
      balance = balance - amount;
      System.out.println("Withdrawal of " + amount + " successful");
    } else {
      throw new Exception("Insufficient funds or invalid amount for withdrawal");
    }
  }

}
