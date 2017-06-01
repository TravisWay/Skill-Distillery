import java.util.Scanner;

public class DailyRainfall{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("What is the rainfall for this day? ");

    double rainfall = input.nextDouble();

    System.out.println("If you have another day to enter, enter it now. If not, please enter '00'.");

    double next = input.nextDouble();

    int counter = 1;

    while(next != 00){

      rainfall += next;

      System.out.println("If you have another day to enter, enter it now. If not, again please enter '00'.");

      next = input.nextDouble();

      counter ++;



    }


      System.out.println("The total rainfall is: " + rainfall);

      System.out.println("The average rainfall is: " + (rainfall/counter));


  }

}
