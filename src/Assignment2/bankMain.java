package Assignment2;

/**
 * @author abuthair on 26/09/23.
 * 7:17 pm
 * @project CoreJava
 */
public class bankMain {
    public static void main(String[] args) {
        bank bank1 = new bank(2000);
        bank1.withdraw(100);
        System.out.println(bank1.getBalance());
        bank1.deposit(2000);
        System.out.println(bank1.getBalance());
    }
}
