public class bank {

    int account_No;
    String name;
    String acc_type;
    static int amount;
    static int savingsTotal;

    public bank(int account_No,String name, int amount, String acc_type){
        this.account_No = account_No;
        this.name = name;
        this.acc_type = acc_type;
        this.amount = amount;

    }

    public int getAccount_No() {
        return account_No;
    }

    public String getName() {
        return name;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public int getAmount() {
        return amount;
    }
    public static int getSavingsTotal() {
        return savingsTotal;
    }
    public static void setSavingsTotal(int amount) {
        savingsTotal = savingsTotal+amount;
    }


}
