import java.util.Scanner;

public class ReportCard{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("What is the first grade for this student? ");

    double grades = input.nextDouble();

    System.out.println("If you have another grade to enter, enter it now. If not, please enter '00'.");

    double next = input.nextDouble();

    int counter = 1;

    while(next != 00){

      grades += next;

      System.out.println("If you have another grade to enter, enter it now. If not, again please enter '00'.");

      next = input.nextDouble();

      counter ++;



    }


      System.out.println("The average grade is: " + (grades/counter));


  }

}
