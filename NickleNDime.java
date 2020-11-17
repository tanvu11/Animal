package baitap;

public class NickleNDime extends Account {
    public int getWithdrawCount() {
        return withdrawCount;
    }

    public void setWithdrawCount(int withdrawCount) {
        this.withdrawCount = withdrawCount;
    }

    private int withdrawCount;

    public NickleNDime(double balance) throws Exception {
        super(balance);
        this.withdrawCount = 0;
    }

    @Override
    public double withdraw(double amount) {
        if (balance < amount) System.out.println("Withdraw amount must < balance");
        else {
            this.setWithdrawCount(this.getWithdrawCount() + 1);
            this.balance -= amount;
            this.transactions++;
        }
        return balance;
    }
    @Override
    public void endMonthCharge() {
        this.balance -= (this.getWithdrawCount() * 0.5);
        if (balance < 0) this.balance = 0;

    }
}
