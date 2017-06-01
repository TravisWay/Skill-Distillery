public class factorial{


  public static void main(String[] args) {

      //int answer =1;

      for(int i =1; i<10; i++){

          int k=i;

          int answer =1;

          System.out.print(i +"!: ");

          //System.out.println(answer);

          for(int j=0; j<i; j++){

            answer = answer*k;

            k--;

          }

          System.out.println(answer);




          }



      }



  }
