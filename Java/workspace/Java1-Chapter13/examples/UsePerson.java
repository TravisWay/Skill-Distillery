package examples;

import solutions.BadAgeException;

public class UsePerson {
    public static void main(String[] args) throws BadAgeException {
        Person p = null;
        String name = null;
        int age =180;
        name = "Some Name"; // comment this line to see an exception

        try {
            p = new Person(name,age);
            
        }
        catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(p);
    }
}
