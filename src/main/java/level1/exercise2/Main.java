package level1.exercise2;

public class Main {
    public static void main(String []args) {
        Person person1 = new Person("Marcelo", "Perez", 18);
        Person person2 = new Person("Alejandra", "Rosario", 33);

        System.out.println("First print arguments:");
        level2.ex1.GenericMethods.printArguments(person1.getName(), person2.getAge(), 13.24);
        System.out.println("Second print arguments:");
        level1.exercise2.GenericMethods.printArguments(true, person1.getAge(), person2.getClass().getSimpleName());
    }
}
