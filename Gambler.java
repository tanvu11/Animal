package baitap;

import java.util.Random;

public class Gambler extends Account {
    Random generator = new Random();

    public Gambler(double balance) throws Exception {
        super(balance);
    }

    @Override
    public void endMonthCharge() {

    }
    @Override
    public double withdraw(double amount) {
        int value = generator.nextInt(99);
        if(value>=49) {
            if(balance < amount*2) System.out.println("Withdraw amount must < balance");
            else {
                this.balance-=amount*2;
                this.transactions++;
            }
        }
        else this.transactions++;
        return balance;
    }


}
