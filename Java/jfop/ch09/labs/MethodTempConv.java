import java.util.Scanner;

public class MethodTempConv{

  public static void main(String[] args) {

    //Asks User for temp and scale being used
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your temp: ");

    double temp = input.nextDouble();

    System.out.println("Please enter the temperature scale you are using 'C or F'(uppercase please).");

    String scale = input.next();

    //Invokes conversion method which converts from one scale to the other
    Conversion(temp,scale);


    input.close();


  }

  public static void Conversion(Double temp, String scale){







      //Verifies user entered a F or C and if not prompts them again
      // while(!scale.equals("C") && !scale.equals("F")){
      //
      //   System.out.println("I said a capital F or C, what are you thinking? Try again");
      //
      //   System.out.print("Please enter the temperature scale you are using 'C or F'(uppercase please).");
      //
      //   scale = input.next();




      //checks to see if user input is F or C
      if(scale.equals("F")){

        double cel = (temp -32) / 1.8;

        System.out.println(temp + " degrees Fahrenheit is "+ cel + " degrees Celsius");


      }

      else if(scale.equals("C")) {

        double fahr = (temp *1.8) +32;

        System.out.println(temp + " degrees Celsius is "+ fahr + " degrees Fahrenheit");


        

      }








  }




}
