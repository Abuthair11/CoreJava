package ClassAndObject;

/**
 * @author abuthair on 26/09/23.
 * 6:10 pm
 * @project CoreJava
 */

//class
public class Employee {
    public   String name;
    public int age;
//Parametric Constructor
    Employee(String name ,int age){
        this.name = name;
        this.age = age;
    }

    void getDetails(){
        System.out.println(name);
        System.out.println(age);
    }



    String helloWorld(String message){
        return "Hello World by "+message;
    }


}
