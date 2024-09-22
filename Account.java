public class Account {
    int acc_no;
    String name;
    int amount;

    void insert(int a, String n, int amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(int amt) {
        amount = amount + amt;
        System.out.println(amount + " was added to your account");
    }

    void withdraw(int amt) {
        if (amount < amt) {
            System.out.println("Insufficient balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " has been successfully withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is " + amount);
    }

    void display() {
        System.out.println(acc_no + " for " + name + "with " + amount);
    }

   
   
        public static void main(String[] args) {
            Account a1 = new Account();
            a1.insert(87960, "kellia", 1000);
            a1.display();
            a1.checkBalance();
            a1.deposit(40000);
            a1.checkBalance();
            a1.withdraw(10000);
            a1.checkBalance();
        
    }
}
