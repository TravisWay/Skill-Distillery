import java.util.Scanner;

public class MyThreeVariables{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your dept code");

    String dept = input.next();

    System.out.println("Enter your salary");

    float salary = input.nextFloat();

    System.out.println("Enter your employee id");

    int id = input.nextInt();

    System.out.println("Your dept code is: "+ dept+" Your salary is "+salary +" Your employee id is: "+ id);

    System.out.println("Your dept code is: "+ dept+"\tYour salary is "+salary +"\tYour employee id is: "+ id);

    System.out.println("Your dept code is: "+ dept+"\nYour salary is "+salary +"\nYour employee id is: "+ id);

  }

}
