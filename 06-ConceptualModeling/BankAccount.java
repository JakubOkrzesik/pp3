public class BankAccount {
    private int balance;
    private String accountID;
    private String name;
    private String lastName;

    BankAccount(String name, String lastName, String accountID){
        setName(name);
        setLastName(lastName);
        setAccountID(accountID);
    }


    BankAccount(String name, String lastName, String accountID, int balance){
        setName(name);
        setLastName(lastName);
        setAccountID(accountID);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(amount>this.balance){
            System.out.println("Your balance is too low to withdraw " + amount + "$");
        }
        else if(amount>500){
            System.out.println("The withdraw amount exceeds the maximum withdraw amount");
        }
        else{
            balance-=amount;
        }
    }

    public String toString(){
        return "Balance: " + balance;
    }

    public static void main(String args[]){
        BankAccount bank1 = new BankAccount("Jakub", "Kowalski", "1234567");
        bank1.deposit(500);
        System.out.println(bank1);
        bank1.deposit(200);
        System.out.println(bank1);
        bank1.withdraw(300);
        System.out.println(bank1);
        bank1.withdraw(1000);
        bank1.deposit(1200);
        bank1.withdraw(600);
    }
}
