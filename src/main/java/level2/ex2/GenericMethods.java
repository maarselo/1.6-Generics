package level2.ex2;

public class GenericMethods {
    @SafeVarargs
    public static <T> void printArguments(T ... args) {
        for (T arg : args)
            System.out.println(arg);
    }
}
