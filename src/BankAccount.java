public class BankAccount {
    double balance;
    String ownerName;
    public BankAccount( double balance, String ownerName) {
            this.balance = balance;
            this.ownerName = ownerName;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public boolean withdraw(double amount) {
        if(amount > this.balance) {
                return false;
        }
        this.balance -= amount;
        return true;
    }
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(450, "Sam");
        System.out.println(obj.ownerName+" : balance : "+obj.balance);
        obj.deposit(10);
        System.out.println(obj.ownerName+" : balance : "+obj.balance);
        obj.withdraw(60);
        System.out.println(obj.ownerName+" : balance : "+obj.balance);
    }
}

