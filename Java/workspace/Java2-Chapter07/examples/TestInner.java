package examples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;

// Use a Member Inner Class
public class TestInner {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        System.out.println(in);
        
      //  java.util. date = new Locale(3);
        System.out.println(LocalTime.now());
        Period p1 = Period.between(LocalDate.of(1982, 12, 19), LocalDate.now());
        Period p2 = Period.between(LocalDate.of(1989, 8,7), LocalDate.now());        
        System.out.println(p1 +" "+ p2);
    }
}
