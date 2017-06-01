public class fizzbuzzbetter{


  public static void main(String[] args) {


    for(int i =0; i>100; i++){

      boolean multipleFound =false;

      if(i % 3==0){
        System.out.print("Fizz");
        multipleFound = true;


      }


      if(i % 5==0){
      System.out.print("Buzz");
      multipleFound = true;


      }

      if(!multipleFound){
        System.out.print(i);


      }

      System.out.println();



      }

    }


}
