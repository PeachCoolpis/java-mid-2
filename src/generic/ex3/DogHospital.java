package generic.ex3;

import generic.animal.Dog;

public class DogHospital {
    private final Dog animal;
    
    public DogHospital(Dog animal) {
        this.animal = animal;
    }
    
    public void checkup() {
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        this.animal.sound();
    }
    
    public Dog bigger(Dog target) {
        if (animal.getSize() > target.getSize()) {
            return this.animal;
        }
        return target;
    }
}
