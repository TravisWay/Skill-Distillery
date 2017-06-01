import java.util.Scanner;

import java.lang.Math;

public class PointDistance{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("For the first point, enter the x coordinate: ");

    int x1 = input.nextInt();

    System.out.println("Please enter the y coordinate: ");

    int y1 = input.nextInt();

    System.out.println("For the second point, enter the x coordinate: ");

    int x2 = input.nextInt();

    System.out.println("Please enter the y coordinate: ");

    int y2 = input.nextInt();





    System.out.println(Distance(x1, y1, x2, y2));

    input.close();




  }

  public static double Distance(int x1, int y1, int x2, int y2){

    int a = x1-x2;

    int b = y1-y2;

    double answer = Math.sqrt((Math.pow(a,2)+ Math.pow(b,2)));

    return answer;

  }



}
