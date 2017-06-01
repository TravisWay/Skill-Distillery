import java.util.Scanner;

public class CharClass{

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a character of your choosing: ");

    String test = input.next();

    char test1 = test.charAt(0);

    //Checks to see if char is letter using ascii
    if(test1 <= 90 && test1 >=65 || test1 <=122 && test1 >= 97){

      //Checks to see if char(already confirmed letter) is a vowel
      if(test1 == 'a' || test1 =='e' || test1 =='i' || test1 =='o' || test1 =='u'){

      System.out.println("You entered "+ test1 + " and that is a vowel.");

      }
      //If the char is not a vowel, then this prints
      else{

        System.out.println("You entered " + test1 + " and that is just a run of the mill letter.");
      }

    }

    //Checks to see if char is a number using ascii
    else if(test1 <= 57 && test1 >=48){

        System.out.println("You entered " + test1 + " and that is a number.");

    }

    //Catch all for nonalphanumeric
    else{

      System.out.println("You entered "+ test1 + " and that is a nonalphanumeric character.");
    }

    input.close();

  }
}
