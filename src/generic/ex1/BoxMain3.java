package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integer = new GenericBox<>(1);
        
        GenericBox<String> str = new GenericBox<>("hello");
        System.out.println("integer = " + integer);
        System.out.println("str = " + str);
        
        //타입 추론 : 생성하는 제네릭 타입생략 가능
        GenericBox<String> str2 = new GenericBox<>("타입추론");
        
    }
}
