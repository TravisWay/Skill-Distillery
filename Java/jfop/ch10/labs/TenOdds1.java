public class TenOdds1{

  public static void main(String[] args) {

    int[] xArray = new int[10];



    for(int i=0; i<xArray.length;i++){

        int k=i+1;

        xArray[i]=k+i;

        System.out.print(xArray[i]+ " ");


    }

    System.out.println();

    float a = xArray[0];

    int counter=0;

    for(int i=1; i<xArray.length+1;i++){

    if(a<xArray[i]){
        a=Array[i];



    }
    counter++;


    System.out.println(a + "" + counter);

  //  System.out.println(xArray[9]);



    }


  System.out.println();




}

}
}
