import java.util.Scanner;


public class PowerMethod{

  public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.println("Enter the base");

          double x = input.nextDouble();

          System.out.println("Enter the power");

          int y = input.nextInt();

          System.out.println(Power(x,y));



  }

  public static double Power(double base, int power){


    return (Math.pow(base,power));

  }


}
