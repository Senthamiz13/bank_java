public class current extends bank{
    public current(int account_No, String name, int amount, String acc_type) {
        super(account_No, name, amount, acc_type);
        if((this.acc_type).equals("current")){
            bank.setSavingsTotal(amount);
        }
    }
}
