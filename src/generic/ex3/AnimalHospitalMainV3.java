package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>(new Dog("멍멍이1",100));
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>(new Cat("야옹이1",300));
    //  AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV2<>(1); // 타입매개변수에 맞지않아 컴파일오류가남
        
        dogHospital.checkup();
        catHospital.checkup();
        
    }
}
