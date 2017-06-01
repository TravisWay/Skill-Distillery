import java.util.Scanner;

public class MyNextLargestMultiple{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter one number: ");

    int i = input.nextInt();

    System.out.println("Please enter another number: ");

    int j = input.nextInt();

    int nextmultiple = i + j - i % j;

    System.out.println("The next largest multiple is: " + nextmultiple);

    input.close();
  }




}
