package caesar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//CaesarCipherDecrypter test = new CaesarCipherDecrypter();
		
		
		
		//ExecutorService myExecutorService = Executors.newFixedThreadPool(26);
		//CaesarCipher test = new CaesarCipher();
		//Future<String> future = myExecutorService.submit(test);
		//String answer = future.get();
		//System.out.println(answer);
		//myExecutorService.execute(new CaesarCipherDecrypter("P SLHYULK AV WYVNYHT HA AOL ZRPSS KPZAPSSLYF",4));
		List<Future<String>> donestuff= new ArrayList<Future<String>>();
		Map<Integer, String> sdonestuff = new ConcurrentHashMap<>(); 
		
		String msg = "P SLHYULK AV WYVNYHT HA AOL ZRPSS KPZAPSSLYF";
		ExecutorService myExecutorService= Executors.newCachedThreadPool();
		for(int i =0; i<26; i++){
			CaesarCipher test= new CaesarCipher(i, msg, sdonestuff);
			myExecutorService.submit(test);
			//sdonestuff.put(i,future.get());
		}
		myExecutorService.shutdown();
	
		Set<Entry<Integer, String>> entrySet = sdonestuff.entrySet();
		Iterator<Entry<Integer, String>> i = entrySet.iterator();
		while(i.hasNext()){
		    Entry<Integer, String> element = i.next();
		    System.out.println("Key: "+element.getKey()+" ,value: "+element.getValue());
		
		
		}
		
		
		int [] random = {6,-4,12,0,10};
		int x =12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
		//String hString = x +1;
		
	    

	}	

}
