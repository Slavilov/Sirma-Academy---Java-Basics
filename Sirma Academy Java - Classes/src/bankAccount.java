import java.util.*;

class BankAccount {
    private static int accountCounter = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = accountCounter++;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }
}

public class bankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> accounts = new HashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    if (accounts.containsKey(id)) {
                        accounts.get(id).deposit(amount);
                        System.out.println("Deposited " + (int)amount + " to ID" + id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double rate = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(rate);
                    break;
                case "GetInterest":
                    int accId = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (accounts.containsKey(accId)) {
                        double interest = accounts.get(accId).getInterest(years);
                        System.out.printf("%.2f%n", interest);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
        }
    }
}
