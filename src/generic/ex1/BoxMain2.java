package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(10);
        Integer integer = (Integer) objectBox.getValue();
        
        System.out.println("integer = " + integer);
        
        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String value = (String) stringBox.getValue();
        System.out.println("value = " + value);
        
    }
}
