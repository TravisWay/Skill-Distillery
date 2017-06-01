public class TrigTable{


  public static void main(String[] args) {

    //loop that gives the trig functions for all radians between 0 and 3.5
    for(double i=0; i<3.5; i+=0.1){

      sin(i);
      cos(i);
      tan(i);
    }
  }

  //takes sin of the angle given(x)
  public static void sin(double x){

        System.out.println("sin of "+ x + " " + Math.sin(x));
      }

  //takes cos of the angle given(x)
  public static void cos(double x){

        System.out.println("cos of "+ x + " " + Math.cos(x));

  }
  //takes tan of the angle given(x)
  public static void tan(double x){

        System.out.println("tan of " + x + " " +Math.tan(x));

  }

}
