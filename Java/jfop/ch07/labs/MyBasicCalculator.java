import java.util.Scanner;

public class MyBasicCalculator{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");

    double first = input.nextDouble();

    System.out.print("\n Please enter an operator: ");

    String operator = input.next();

    while(!operator.equals("*") && !operator.equals("+") && !operator.equals("-") && !operator.equals("/")){

      System.out.println("Please only use the *, /, -, +.  Try again.");

      operator = input.next();


    }

    System.out.print("\n Please enter the second number: ");

    double second = input.nextDouble();

    switch(operator){

      case "*": System.out.println("The answer is " + (first * second));

        break;

      case "/":System.out.println("The answer is " + (first / second));

        break;

      case "-":System.out.println("The answer is " + (first - second));

        break;

      case "+":System.out.println("The answer is " + (first + second));

        break;

    }

      input.close();
  }


}
