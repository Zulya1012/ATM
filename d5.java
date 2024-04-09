import java.util.Scanner;
public class d5 {
  public static void main(String[] args) throws Exception {
    int choice;
    Scanner s = new Scanner(System.in);
    Account1 account = new Account1();

    System.out.println("Welcome to Account!");

    do {

      System.out.println("Choose an option:");
      System.out.println("1. Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = s.nextInt();

      switch (choice) {
      case 1:
        System.out.println("Current Balance:" + account.getBalance());
        break;
      case 2:
        System.out.print("Enter deposit amount:");
        double depositAmount = s.nextDouble();
        account.deposit(depositAmount);
        break;
      case 3:
        System.out.print("Enter withdrawal amount:");
        double withdrawAmount = s.nextDouble();
        account.withDraw(withdrawAmount);
        break;
      case 4:
        System.out.println("Exiting...");
        break;
      default:
        System.out.println("Invalid choice. Please try again.");
      }
    }
    while (choice != 4);
  }
}
