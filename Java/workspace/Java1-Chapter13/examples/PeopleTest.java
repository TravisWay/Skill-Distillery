package examples;

import solutions.BadAgeException;

public class PeopleTest {
    public static void main(String[] args) throws BadAgeException {
        Person[] people;

        people = new Person[3];
        try {
            people[0] = new Person("Bob",4);
            people[1] = new Person("Jane",4);
            people[2] = new Person("John",4);
        }
        catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }

/*
        // produces ArrayIndexOutOfBoundsException, a RuntimeException
        for (int i = 0; i < 4; i++)
            System.out.println("people[" + i + "] contains "
                    + people[i]);
*/

        // Use the array length to avoid the RuntimeException
        for (int i = 0; i < people.length; i++)
            System.out.println("people[" + i + "] contains "
                    + people[i]);
    }
}
