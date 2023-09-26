package ClassAndObject;

/**
 * @author abuthair on 26/09/23.
 * 6:09 pm
 * @project CoreJava
 */
public class ClassObject {
    public static void main(String[] args) {
        //Objects
        Employee employee = new Employee("Abuthair",21);


        employee.getDetails();

        Employee emp1 = new Employee("Sheika",21);


        emp1.getDetails();

//        System.out.println(emp1.name);
//        System.out.println(emp1.age);
//        System.out.println(employee.name);
//        System.out.println(employee.age);


        //methods with parameters
        String name = employee.helloWorld("Abuthair");
        System.out.println(name);
    }


}

