
class Paper{
   public static void main(String args[]){
       int var = 20, i=0;
       boolean th =Boolean.parseBoolean("true") == true; 
       System.out.println(th);
       do{
         while(true){
         if( i++ > var) break;
         }
      }while(i<var--);
      System.out.println(var);
   }
}