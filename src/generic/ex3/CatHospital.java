package generic.ex3;

import generic.animal.Cat;

public class CatHospital {
    private final Cat animal;
    
    public CatHospital(Cat animal) {
        this.animal = animal;
    }
    
    public void checkup() {
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        this.animal.sound();
    }
    
    public Cat bigger(Cat target) {
        if (animal.getSize() > target.getSize()) {
            return this.animal;
        }
        return target;
    }
}
