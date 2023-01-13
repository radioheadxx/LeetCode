public class Person {
    String name;
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "EJava";
        anotherMethod(person);
        System.out.println(person.name);
        someMethod(person);
        System.out.println(person.name);
    }

    static void anotherMethod(Person p) {
        p = new Person();
        p.name = "anotherMethod";
        System.out.println(p.name);
    }

    static void someMethod(Person p) {
        p.name ="someMethod";
        System.out.println(p.name);
    }
}