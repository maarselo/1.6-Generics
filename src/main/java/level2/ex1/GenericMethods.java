package level2.ex1;

public class GenericMethods {
    public static <T, U> void printArguments(String arg1, T arg2, U arg3) {
        System.out.println("(Fixed Type)" + arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
