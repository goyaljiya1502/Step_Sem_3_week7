package Week7;

class PiggyBank {
    private double savings;
    private final String id;

    PiggyBank(String id) {
        this.id = id;
        savings = 0;
    }

    void deposit(double amount) {
        savings += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdrawal rejected");
        } else {
            savings -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    double getSavings() {
        return savings;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");

        System.out.println("Piggy Bank ID: " + pb.id);

        pb.deposit(100);
        System.out.println("Savings: " + pb.getSavings());

        pb.withdraw(30);
        System.out.println("Savings: " + pb.getSavings());

        pb.withdraw(500);
        System.out.println("Savings: " + pb.getSavings());
    }
}