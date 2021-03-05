package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        int balance = wallet.getBalance();
        if(amount>balance){
            String notification = "Amount exceeds balance, unable to complete";
            System.out.println(notification);
            cashSlot.dispense(0);
        }
        else
            //wallet.debit(amount);
            cashSlot.dispense(amount);

    }


}
