package examples;

public class MultTable {
    public static void main(String[] args) {
        int num = 0;
        int factor = 0;
		int pow=1;
        for (num = 1; num <= 8; num = num + 1) {
        	
        		pow=num;
        			
            for (factor = 1; factor <= 8; factor = factor + 1) {
                
                System.out.print((pow) + "\t");
                
                pow=pow*num;
                
            	
                
                
            }
            System.out.println("");
        }
    }
}
