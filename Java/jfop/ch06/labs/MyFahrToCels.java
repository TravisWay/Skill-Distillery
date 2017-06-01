import java.util.Scanner;

public class MyFahrToCels{

  public static void main(String [] args){

    System.out.println("Enter the temperature in Fahrenheit");

    Scanner input = new Scanner(System.in);

    double Fahr = input.nextDouble();

    double cel = (Fahr - 32) / (1.8);

    System.out.println("The temperature in Celsius is: "+ cel);

    input.close();
  }

}
