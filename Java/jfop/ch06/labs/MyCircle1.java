import java.util.Scanner;

public class MyCircle1{

  public static void main(String [] args){

  System.out.println("Enter the radius of the circle");

  Scanner input = new Scanner(System.in);

  float radius = input.nextFloat();

  float circum = 2*(3.141592f * radius);

  System.out.println("The radius of the circle is: "+ radius);

  System.out.println("The circumference of the circle is: "+ circum);






  }

}
