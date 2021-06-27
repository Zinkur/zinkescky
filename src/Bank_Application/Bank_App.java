package Bank_Application;

public class Bank_App {
    private double balance;
    private String firstName;
    private String lastName;


    public Bank_App(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double deposit) {
        if (deposit < 1){
            return 0.0;
        }
        return balance += deposit;
    }
}
