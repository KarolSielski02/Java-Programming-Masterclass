public class BankAccount {

    public BankAccount(String accountNumber, Double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private String accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("New deposit, updated balance = " + this.balance);
    }

    public void withdraw(double withdraw) {
        if (this.balance < withdraw) {
            System.out.println("Insufficient founds.");
        } else {
            this.balance -= withdraw;
            System.out.println("New withdrawal, updated balance = " + this.balance);
        }
    }
}
