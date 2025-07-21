package level3;

public class Generic {
    public static <T extends Telephone> void methodTelephone(T obj) {
        obj.call();
    }
    public static <T extends Smartphone> void methodSmartphone(T obj) {
        obj.call();
        obj.makePhotos();
    }
}
