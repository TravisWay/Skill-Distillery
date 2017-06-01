import java.util.Scanner;

public class MyFiveIntegers{

  public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number");

    int a = input.nextInt();

    System.out.println("Please enter another number");

    int b = input.nextInt();

    System.out.println("Please enter another number");

    int c = input.nextInt();

    System.out.println("Please enter another number");

    int d = input.nextInt();

    System.out.println("Please enter one last number");

    int e = input.nextInt();

    System.out.println(a+" "+b+" "+c+" "+d+" "+e);

    System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);

    System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);



  }




}
