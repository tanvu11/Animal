package baitap;

public abstract class Account {

    public Account(double balance) throws Exception {
        if (balance<0) throw new Exception("Balance must be positive");
        this.balance= balance;
        this.transactions=0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >=0)
        this.balance = balance;
        else throw new IllegalArgumentException("Balance must be positive");
    }

    public double getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    protected double balance; // số tiền hiện có trong tk
    protected int transactions; // tổng số giao dịch trong tháng
    //gửi 1 khoản tiền vào tài khoản
    public double deposit(double mount){
        this.transactions ++;
        return mount + this.balance;

    }
    //rút tiền
    public double withdraw (double mount){
        this.transactions ++;
        return this.balance - mount;
    }
    //
    public void endMonth(){
        endMonthCharge();
        System.out.println("số tiền còn lại trong tài khoản: " + this.balance);
        System.out.println("số giao dịch trong tháng: " + this.transactions);
        transactions = 0;
    }
    public abstract void endMonthCharge();


}
