package examples;

import java.util.Comparator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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
    
    /*
     * Comparator<T> : int compare(T o1, T o2) : compare Planet diameters 
     */
//    Comparator<T> mine = new Comparator<T>() {
//    	
//    	public int compare(T o1, T o2)->o1.getDiameter > o2.getDiameter);	
//	};
    
    
    
    /*
     * Predicate<T> : boolean test(T o1) : return true if Planet name contains "u" 
     */
    
    /*
     * BiPredicate<T, U> : boolean test(T t, U u) : return true if Planet name contains the given String, case-insensitive
     */
    
    /*
     * Function<T, R> : R apply(T t) : return the President's name in the format "Lastname, Firstname"
     */
    
    /*
     * BiFunction<T, U, R> : R apply(T t, U u) : Replace all vowels in a President's first and last name with a sequential number starting with U u, and return the transformed name String.
     * For example u = 0, President name "Abraham Lincoln" is returned "0br1h2m L3nc4ln".
     */
}