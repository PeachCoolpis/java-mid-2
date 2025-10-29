package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {
    
    public static <T extends Animal> T  checkup(T t){
        System.out.println("동물 이름 = " + t.getName());
        System.out.println("동물 크기 = " + t.getSize());
        return t;
    }
    
    public static  <T extends Animal> T bigger(T t1 , T t2) {
        //컴파일 오류
        if (t1.getSize() > t2.getSize()) {
            return t1;
        }
        return t2;
    }
}
