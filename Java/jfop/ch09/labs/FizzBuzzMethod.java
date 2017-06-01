public class FizzBuzzMethod {

  public static void main(String[] fArgs){
    for(int num=1; num <=100; num++){
      boolean multipleFound = false;
      if ( isMultiple(num,3) ) {
        System.out.print("Fizz");
        multipleFound = true;
      }
      if ( isMultiple(num,5) ) {
        System.out.print("Buzz");
        multipleFound = true;
      }
      if ( ! multipleFound ) {
        System.out.print(num);
      }
      System.out.println();
    }//end for
  }

  public static boolean isMultiple(int a, int b) {
    boolean result = false;
    if ( a % b == 0 ) {
      result = true;
    }
    else {
      result = false;
    }
    return result;
  }
  public static boolean isMultiple2(int a, int b) {
    if ( a % b == 0 ) {
      return true;
    }
    else {
      return false;
    }
  }
  public static boolean isMultiple3(int a, int b) {
    return a % b == 0 ;
  }

}
