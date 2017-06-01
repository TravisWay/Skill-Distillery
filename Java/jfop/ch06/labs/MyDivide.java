import java.util.Scanner;

public class MyDivide{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a dividend: ");

    double dividend = input.nextDouble();

    System.out.println("Enter a divisor: ");

    double divisor = input.nextDouble();

    while(divisor == 0){

      System.out.println("Enter a number besides 0: ");

      divisor = input.nextDouble();
    }

    double answer = dividend / divisor;



    System.out.println("The answer is: "+ answer);

    input.close();


  }

}
