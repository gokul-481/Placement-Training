import java.util.*;
public class Banking {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        long acc_num=in.nextLong();
        System.out.print("Enter Account Balance: ");
        float balance=in.nextFloat();
        
        SavingsAccount account = new SavingsAccount(acc_num, balance);
        account.calculateIntrest();
    }
}

abstract class BankAccount{
    private long accountNumber;
    private float balance;
    static float intrestRate = 9;
    BankAccount(long acc, float bal){
        this.accountNumber = acc;
        this.balance = bal;
    }
    public long get_acc(){
        return accountNumber;
    }
    public float get_bal(){
        return balance;
    }
    public float get_int(){
        return intrestRate;
    }
    abstract void calculateIntrest();
    
}
class SavingsAccount extends BankAccount{
    SavingsAccount(long acc, float bal){
        super(acc, bal);
    }
    void calculateIntrest(){
        System.out.println("Account number: "+get_acc());
        System.out.println("Balance: "+get_bal());
        float intrest = (get_bal() * get_int()) / 100;
        System.out.println("Intrest rate: "+intrest);

    }

}