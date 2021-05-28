import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        int userInput;
        Scanner inputCollector = new Scanner(System.in);
        do {
        String transactionPrompt = """
                Enter 1 for deposit;
                Enter 2 for Withdraw;
                Enter 3 to view all account;
                Enter 4 to transfer;
                Enter 5 to view your details;
                Enter 6 to exit;
                Enter 7 to logout;
                """;
        System.out.println(transactionPrompt);
        userInput = inputCollector.nextInt();

            if (userInput == 1) System.out.println("Deposit");
            if (userInput == 2) System.out.println("Withdraw");
            if (userInput == 3) System.out.println("View all account");
            if (userInput == 4) System.out.println("Transfer");
            if (userInput == 5) System.out.println("View your details");
            if (userInput == 6) System.out.println("Exit");
            if (userInput == 7) System.out.println("Logout");
            if (userInput > 7 || userInput< 1)System.out.println("enter a valid number");
        }
        while (userInput != 6);
    }
}