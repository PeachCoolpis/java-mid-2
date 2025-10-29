package generic.ex4;

public class GenericMethod {
    
    public static Object objectMethod(Object o) {
        System.out.println("Object print = " + o);
        return o;
    }
    
    public static <T> T genericMethod(T o) {
        System.out.println("Object print = " + o);
        return o;
    }
    
    public static <T extends Number> T numberMethod(T o) {
        System.out.println("Object print = " + o);
        return o;
    }
}
