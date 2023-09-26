package Assignment2;

/**
 * @author abuthair on 26/09/23.
 * 7:14 pm
 * @project CoreJava
 */
public class bank {
    double balance;

    bank(double balance){
        this.balance = balance;
    }
    void withdraw(int x){
        balance =balance-x;
    }
    void deposit(int x){
       balance = balance+x;
    }
    public double getBalance(){
        return balance;
    }
}
