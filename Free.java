package baitap;

public class Free extends Account {

    public Free(double balance) throws Exception {
        super(balance);
    }

    @Override
    public void endMonthCharge() {
        this.balance -= 5;
        if (balance < 0) this.balance = 0;
        System.out.println(this.balance);
    }
}
