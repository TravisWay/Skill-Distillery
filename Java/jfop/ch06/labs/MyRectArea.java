import java.util.Scanner;

public class MyRectArea{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("What is the x coordinate?");

    int x = input.nextInt();

    System.out.println("What is the y coordinate?");

    int y = input.nextInt();

    int area = x*y;

    System.out.println("The area the is: "+ area);

    



  }




}
