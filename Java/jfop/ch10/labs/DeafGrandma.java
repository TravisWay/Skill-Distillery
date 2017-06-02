import java.util.*;

public class DeafGrandma{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String talk = "";

    while(!talk.equals("GOODBYE")){

    System.out.println("Speak up to Grandma:");

    talk = input.next();

    System.out.println(Grandma((Us(talk))));


    }
  }

  public static String Grandma(int x){

    String response[] = {"SPEAK UP BILLY","NO NOT SINCE THE WAR","SMELL YA LATER"};

    return response[x];

  }


  public static int Us(String y){

      int x=0;

      boolean shouted = true;

      if(y.equals("GOODBYE")){

        x =2;
      }
      else{

        char[] letters = y.toCharArray();

        for(int i =0;i<letters.length;i++){

          if(letters[i]>='a' && letters[i]<='z'){

            x=0;

            shouted = false;

            break;
          }


        }
        if(shouted){

          x=1;

        }

        else{
          x=0;

        }

  }
  return x;

}

}
