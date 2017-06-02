import java.util.Scanner;

public class TenFloats{

  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      float[] xArray = new float[10];

      for(int i=0; i<xArray.length;i++){

          System.out.println("\nPlease enter a float;" );

          float k=input.nextFloat();

          xArray[i]=k;

      }

      for(int i=0; i<xArray.length;i++){


          System.out.print(xArray[i]+ " ");

      }

      System.out.println();

      for(int i =0; i<xArray.length-1; i++){

        float a = xArray[i];
        float b = xArray[i+1];

        while (b>a){
          a=b;
          b=xArray[i+2];

          System.out.print(a+ " " +b);

        }
        while (a>b){
            b=xArray[i+2];

            System.out.println(a+ " " +b);



        }






      }


  }





}
