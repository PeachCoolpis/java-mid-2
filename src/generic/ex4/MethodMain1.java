package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Integer i1 = (Integer) GenericMethod.objectMethod(i);
        
        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        
        Integer i2 = GenericMethod.<Integer>numberMethod(i1);
        
        Double v = GenericMethod.<Double>genericMethod(20.0);
    }
}
