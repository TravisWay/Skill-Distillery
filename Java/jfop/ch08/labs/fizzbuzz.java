public class fizzbuzz{

  public static void main(String[] args) {


      System.out.println(2%5);

      for(int i=1; i<100;i++){

          //if(i>=5){

            //Checks to see if i is divisible by both 3 and 5
            if((i%3==0)&&(i%5==0)){
              System.out.println("fizzbuzz");

            }
            //Checks to see if i is divisible by 3 and not 5
            else if((i%3==0)&&(i%5!=0)){

              System.out.println("fizz");
            }

            //Checks to see if i is divisible by 5 and not 3

            else if((i%5==0)&&(i%3!=0)){

              System.out.println("buzz");

            }

            //prints all other numbers not divisible by 5 or 3 and more than 5
            else {

              System.out.println(i);

            }



          // else if (i<=2 || i ==4){
          //
          //     System.out.println(i);
          //
          // }
          //
          // else (i==3)
          //   System.out.println("fizz");



      }




  }






}
