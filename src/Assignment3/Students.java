package Assignment3;

/**
 * @author abuthair on 26/09/23.
 * 7:24 pm
 * @project CoreJava
 */
public class Students {
    String name;
    int id;

    Students(String name,int id){
      this.name = name;
      this.id =id;
    }
    void getDetails(int[] grade){

        System.out.println(name +" his Id is" + id +"  with grade " +getGrades(grade));
    }
    String  getGrades(int [] marks ){
        int sum = 0;
        for(int i = 0 ;  i < marks.length; i++){
            sum+=marks[i];
        }
        int average = sum/marks.length;
        if(average > 80){
            return "A";
        }
        else if(average > 60 && average < 80 ){
            return "B";
        }
        else{
            return "F";
        }

    }
}
