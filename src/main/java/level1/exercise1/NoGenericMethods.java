package level1.exercise1;

public class NoGenericMethods {
    private String s1;
    private String s2;
    private String s3;

    public NoGenericMethods(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String getS1() {return s1;}
    public String getS2() {return s2;}
    public String getS3() {return s3;}
    public void setS1(String s1) {this.s1 = s1;}
    public void setS2(String s2) {this.s2 = s2;}
    public void setS3(String s3) {this.s3 = s3;}

    public static void main(String []args) {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Hello" , "See you soon", "Good bye");
        System.out.println(noGenericMethods1.getS1());
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("See you soon", "Good bye", "Hello");
        System.out.println(noGenericMethods2.getS2());
    }
}

