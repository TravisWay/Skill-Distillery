package examples;

import java.util.Set;
import java.util.TreeSet;

public class SortStrings {

    public static void main(String[] args) {
        Set<String> students = new TreeSet<>();
        //  Set<String> students = new TreeSet<>(new StringComparator());
        students.add("James");
        students.add("Jack");
        students.add("joseph");
        students.add("Jim");
        students.add("Juan");


       // for (String student : students) {
        //    System.out.println(student);
        //}
        
        for (int i = 0; i < 100; i++) {
			
		
        //System.out.println(Math.floor(Math.random()*52));
        System.out.println(((int)(Math.ceil(Math.random()* 52))));
        }
    }
}
