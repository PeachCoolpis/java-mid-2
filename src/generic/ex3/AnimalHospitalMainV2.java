package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>(new Dog("멍멍이1",100));
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>(new Cat("야옹이1",300));
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>(1); // 이딴것도 들어올수있음
    }
}
