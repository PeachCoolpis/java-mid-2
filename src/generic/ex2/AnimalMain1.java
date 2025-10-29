package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("동물", 0);
        Cat cat = new Cat("동물", 0);
        
        Box<Dog> dogBox = new Box<>();
        dogBox.setValue(dog);
        
        System.out.println("dogBox = " + dogBox);
        
        Box<Cat> catBox = new Box<>();
        catBox.setValue(cat);
        System.out.println("catBox = " + catBox);
        
        
    }
}
