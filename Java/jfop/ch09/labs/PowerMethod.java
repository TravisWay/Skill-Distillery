import java.util.Scanner;


public class PowerMethod{

  //Asks the user for input for base and power and invokes the Power Method
  public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.println("Enter the base");

          double x = input.nextDouble();

          System.out.println("Enter the power");

          int y = input.nextInt();

          System.out.println(Power(x,y));



  }
  //The power variable tells this method how many times to multiply the base by itself.
  public static double Power(double base, int power){

    double answer = base;

      for(int i = 1; i<power; i++){

          answer = base * answer;



      }

      return answer;

    //return (Math.pow(base,power));

  }


}
