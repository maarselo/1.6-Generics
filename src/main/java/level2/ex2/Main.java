package level2.ex2;

public class Main {
    public static void main(String []args) {
        Person person1 = new Person("Marcelo", "Perez", 18);
        Person person2 = new Person("Alejandra", "Rosario", 33);

        System.out.println("First print arguments:");
        GenericMethods.printArguments(person1.getName(), person2.getAge(), 13.24, false, 1.24f, 'A');
        System.out.println();
        System.out.println("Second print arguments:");
        GenericMethods.printArguments("How are you?", true, person1.getAge(), person2.getClass().getSimpleName());
        System.out.println();
        System.out.println("Third print arguments:");
        GenericMethods.printArguments(1);
    }
}
