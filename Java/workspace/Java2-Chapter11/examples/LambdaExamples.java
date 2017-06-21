package examples;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;


public class LambdaExamples {
    /*
     * Create static fields for each definition below based on the functional interface, method, and functionality.
     * Interface : method : functionality
     * Note that functionality may define the type of a parameterized interface.
     */
    
    /*
     * Runnable : void run() : System.out.println("Running")
     */
    static Runnable runLambda = () -> System.out.println("Running");
    static Runnable runLambda2 = () -> { System.out.println("Running"); };
    /*
     * java.util.concurrent.Callable<V> : V call() : return the current year as an Integer
     */
    static Callable<Integer> callLambda = () -> LocalDate.now().getYear();
    static Callable<Integer> callLambda2 = () -> {return LocalDate.now().getYear();};
    
    
    /*
     * Comparator<T> : int compare(T o1, T o2) : compare Planet diameters 
     */
    Comparator<Planet> mine =  (o1,o2)->{int o1Diameter= o1.getDiameter();
    		int o2Diameter= o2.getDiameter();
    		return Integer.valueOf(o1Diameter).compareTo(o2Diameter);};
    	
    Comparator<Planet> mine2 =  (Planet o1, Planet o2)->Integer.valueOf(o1.getDiameter()).compareTo(o2.getDiameter());
    
    
    
    
    /*
     * Predicate<T> : boolean test(T o1) : return true if Planet name contains "u" 
     */
    Predicate<Planet> predicateLambda = o1->o1.getName().toLowerCase().contains("u");
    
    
    /*
     * BiPredicate<T, U> : boolean test(T t, U u) : return true if Planet name contains the given String, case-insensitive
     */
    BiPredicate<Planet, String> biPred1 = (p1,s1)->p1.getName().toUpperCase().contains(s1.toUpperCase());
    
    /*
     * Function<T, R> : R apply(T t) : return the President's name in the format "Lastname, Firstname"
     */
    Function<President, String> funk1 = pres-> pres.getLastName().concat(", ").concat(pres.getFirstName());
    /*
     * BiFunction<T, U, R> : R apply(T t, U u) : Replace all vowels in a President's first and last name with a sequential number starting with U u, and return the transformed name String.
     * For example u = 0, President name "Abraham Lincoln" is returned "0br1h2m L3nc4ln".
     */
    
}