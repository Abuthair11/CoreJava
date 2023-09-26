package Assignment3;

import java.util.Scanner;

/**
 * @author abuthair on 26/09/23.
 * 7:35 pm
 * @project CoreJava
 */
public class StudentsMain {
    public static void main(String[] args) {
        Students students1 = new Students("abu" , 1);
        Students students2 = new Students("Sheik" , 2);
        Scanner sc =new Scanner(System.in);
        int marks[] = new int[3];
        for(int i = 0 ; i <3 ; i++){
             marks[i] = sc.nextInt();
        }
        int marks2[] = new int[3];
        for(int i = 0 ; i <3 ; i++){
            marks2[i] = sc.nextInt();
        }
        students2.getGrades(marks2);
        students2.getDetails(marks2);
        students1.getGrades(marks);
       students1.getDetails(marks);

    }
}
