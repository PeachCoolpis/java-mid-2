package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1(new Dog("멍멍이1",100));
        AnimalHospitalV1 catHospital = new AnimalHospitalV1(new Cat("야옹이1",300));
        
        dogHospital.checkup();
        catHospital.checkup();
    }
}
