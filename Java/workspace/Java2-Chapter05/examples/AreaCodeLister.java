package examples;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class AreaCodeLister {
    private Map<String, String> areaCodes;
    private Map<String, String> abbreviations;
    private TreeMap<String, String> treeMap = new TreeMap<String, String>();

    public AreaCodeLister() {
        populateAreaCodes();
        populateAbbreviations();
        print();
    }

    private void populateAreaCodes() {
        areaCodes = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                "areacodes.txt"))) {

            String line = null;
            while ((line = in.readLine()) != null) {
                //System.out.println(line);
                String regex = "(\\d*)\\t([A-Z]{2})";
                String string = line;

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(string);

                while (matcher.find()) {
                    
                    for (int i = 1; i <= 1; i++) {
                        areaCodes.put(matcher.group(1), matcher.group(2));
                        //System.out.println(matcher.group(1)+" "+ matcher.group(2));
                    }
                }
                
                
                
            }
            
            
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
       
			
		}
    }

    private void populateAbbreviations() {
        abbreviations = new HashMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                "abbreviations.txt"))) {

            String line = null;
            while ((line = in.readLine()) != null) {
             //   System.out.println(line);
                // Add code to parse out the state and abbreviation 
                // from each line.  Then add them to the abbreviations
                // Map.
            	String regex = "([A-Z]*)\\t([A-Z]{2})";
                String string = line;

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(string);

                while (matcher.find()) {
                    
                    for (int i = 1; i <= 1; i++) {
                        abbreviations.put(matcher.group(2), matcher.group(1));
                        
                        //System.out.println(matcher.group(2)+" "+ matcher.group(1));
                    }
                }
            }
            //treeMap.putAll(abbreviations);
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    
    print();
    }

    private void print() {
        // Add code to display the area code and the full state name
        // associated with it.
//    	
//    	Iterator it = areaCodes.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry)it.next();
//            System.out.print(pair.getKey()+" ");
//            it.remove(); // avoids a ConcurrentModificationException
// 
//            System.out.println(abbreviations.get(pair.getValue()));
//        }
            
         Set<String> areaCodeKeys= areaCodes.keySet();
         Iterator<String> it2= areaCodeKeys.iterator();
         while(it2.hasNext()){
        	 String thisAreaCode = it2.next();
        	 String abbrev = areaCodes.get(thisAreaCode);
        	 String statename = this.abbreviations.get(abbrev);
        	 
        	 System.out.println(thisAreaCode + " "+ statename);
        	 
        	 
         }
         
         
         
         
         
    }

    public static void main(String[] args) {
        new AreaCodeLister();
        
    }
}
