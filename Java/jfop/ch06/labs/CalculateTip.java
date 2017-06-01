import java.util.Scanner;

public class CalculateTip{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("How much was the restaurant check:  ");

    double check = input.nextInt();

    double tip10 = check * .1;

    double tip15 = check * .15;

    double tip20 = check * .20;


    System.out.println("If you want to leave a 10% tip, that would be: " +tip10);

    System.out.println("If you want to leave a 15% tip, that would be: " +tip15);

    System.out.println("If you want to leave a 20% tip, that would be: " +tip20);


  }


}
