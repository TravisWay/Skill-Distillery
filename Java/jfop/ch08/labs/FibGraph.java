public class FibGraph{

  public static void main(String[] args) {

    int a = 0;

    int b = 1;

    int answer = 0;

    for(int i=0;i<10;i=i+1){

		answer=a+b;

      a=b;

      b=answer;

      
		
		for(int j=0; j<answer; j++){
      			
      			System.out.print("*");}
     
     System.out.println(answer);
      
      

    //   for(answer = j+i; answer<20;answer=answer+1){
    //
    //     System.out.println(j);
    // }

    }

  }



}
