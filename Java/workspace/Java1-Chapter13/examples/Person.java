package examples;

import solutions.BadAgeException;

public class Person {
    private String name;
    private int age;
    public Person(String n, int a) throws InvalidDataException, BadAgeException{
        if (n == null || n.equals("")) {
            throw new InvalidDataException();
        }
        name = n;
        if (a < 0 || a > 120) {
            throw new BadAgeException(a);
        }
        age = a;
    }
    

    public String toString() {
        return "Person [name=" + name + "]";
    }
}
