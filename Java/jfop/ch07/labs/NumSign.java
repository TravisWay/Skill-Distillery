import java.util.Scanner;

public class NumSign{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Give me a number and I will tell you if it is positive or negative");

    double num = input.nextDouble();
    //statement that multiplies by -1 to see if number is positive
    if(-num < 0){
      System.out.println("The number is positive");


    }
    //prints this if the number is zero
    else if (num ==0){
      System.out.println("That is zero");
    }
    //prints this if the number is negative
    else{
      System.out.println("The number is negative");

    }

    input.close();
  }

}
