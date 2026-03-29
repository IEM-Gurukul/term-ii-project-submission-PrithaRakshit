import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        banksystem bank = new banksystem();

        while (true) {
            System.out.println("1.Create 2.Deposit 3.Withdraw 4.Display 5.Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                int id = sc.nextInt();
                double bal = sc.nextDouble();
                bank.addAccount(new Account(id, bal));
            }

            else if (choice == 2) {
                double amt = sc.nextDouble();
                bank.accounts.get(0).deposit(amt);
            }

            else if (choice == 3) {
                double amt = sc.nextInt();
                bank.accounts.get(0).withdraw(amt);
            }

            else if (choice == 4) {
                bank.displayAll();
            }

            else {
                break;
            }
        }
    }
}