public class savings extends bank{
    public savings(int account_No, String name, int amount, String acc_type) {
        super(account_No, name, amount, acc_type);
        if((this.acc_type).equals("savings")){
            bank.setSavingsTotal(amount);

        }
    }
}
