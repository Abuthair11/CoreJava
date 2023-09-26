package Assignment1;

/**
 * @author abuthair on 26/09/23.
 * 7:07 pm
 * @project CoreJava
 */
public class vehicleMain {
    public static void main(String[] args) {
        vehicle vehicle1 = new vehicle("BMW" , "A3" , 2000l);
        vehicle1.getDetails();
        vehicle vehicle2 = new vehicle("Aadi" , "Q1",1200l);
        vehicle2.getDetails();

    }
}
