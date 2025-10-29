package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        
        // Animal 포함 상위 타입전달 가능
        writeBox(objectBox);
        writeBox(animalBox);
//        writeBox(catBox); // 하한 와일드 카드로 인해 컴파일 오류 같거나 높아야함
//        writeBox(dogBox);
    }
    
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이",100));
    }
}
