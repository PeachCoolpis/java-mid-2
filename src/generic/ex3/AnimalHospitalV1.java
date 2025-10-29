package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;

public class AnimalHospitalV1 {
    
    private final Animal animal;
    
    public AnimalHospitalV1(Animal animal) {
        this.animal = animal;
    }
    
    public void checkup(){
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        this.animal.sound();
    }
    
    public Animal bigger(Animal target) {
        if (animal.getSize() > target.getSize()) {
            return this.animal;
        }
        return target;
    }
}
