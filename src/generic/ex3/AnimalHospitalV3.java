package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal>  {
    
    private final T animal;
    
    public AnimalHospitalV3(T animal) {
        this.animal = animal;
    }
    
    public void checkup(){
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 크기 = " + animal.getSize());
        this.animal.sound();
    }
    
    public T bigger(T target) {
        //컴파일 오류
        if (animal.getSize() > target.getSize()) {
            return this.animal;
        }
        return target;
    }
    
    public T getAnimal() {
        return animal;
    }
}
