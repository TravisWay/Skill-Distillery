package Labs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;



public class ReadFile implements Runnable{
	private int arg;
	private String filename;
	private Thread thread;

	
	public static void main(String[] args) {
		ReadFile one = new ReadFile(0, "readthis.txt");
		ReadFile two = new ReadFile(1, "readthis.txt");
		ReadFile three = new ReadFile(2, "readthis.txt");
		one.startThread();
		two.startThread();
		three.startThread();
		
		
		
}	
	
	public ReadFile(int arg, String filename) {
		super();
		this.arg = arg;
		this.filename = filename;
		thread = new Thread(this);
	}
	
		public void run() {
			 String thisLine = null;
			 int i =1;
			try {
			      
		         BufferedReader br = new BufferedReader(new FileReader(filename));
		         
		         while ((thisLine = br.readLine()) != null) {
		            System.out.println(arg + " " +thisLine);
		            i++;
		            if(i>5){
		            	thread.yield();
		            }
		         }       
		      } catch(Exception e) {
		         e.printStackTrace();
		      }
		   }
		public void startThread() {
		    thread.start();
		  }
		
		}
	
	

