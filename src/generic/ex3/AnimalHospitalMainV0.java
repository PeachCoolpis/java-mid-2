package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital(new Dog("멍멍이1",100));
        CatHospital catHospital = new CatHospital(new Cat("야옹이1",300));
        
        dogHospital.checkup();
        catHospital.checkup();
    }
}
