public class Fib{

  public static void main(String[] args) {

    int a = 0;

    int b = 1;

    int answer=0;

    for(int i=0;i<18;i++){

      //System.out.print(i+1 + ": ");

      answer=a+b;

      a=b;

      b=answer;

      System.out.println(answer);

    //   for(answer = j+i; answer<20;answer=answer+1){
    //
    //     System.out.println(j);
    // }

    }

  }



}
