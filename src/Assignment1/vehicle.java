package Assignment1;

/**
 * @author abuthair on 26/09/23.
 * 7:04 pm
 * @project CoreJava
 */
public class vehicle {
    String carName;
    String model;
    long price;

    vehicle(String carName,String model,long price){
        this.carName = carName;
        this.model = model;
        this.price = price;
    }
    void getDetails(){
        System.out.println(carName +" " +model + " "+price );

    }
}
