public class FibbyMethod{

  public static void main(String[] args) {


      String result = Fibby();

      System.out.println(result);

      char[] chars = result.toCharArray();

      for(int i=0; i<1000; i++){

          System.out.println(chars[i]);

      }

    }

    public static String Fibby(){

      int a = 0;

      int b = 1;

      int answer=0;

      String output= "";

      for(int i=0;i<18;i++){

        //System.out.print(i+1 + ": ");
        output = output +(answer +"\t");

        answer=a+b;

        a=b;

        b=answer;




    }

      return output;

  }

}
