package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T>  {
    
    private final T animal;
    
    public AnimalHospitalV2(T animal) {
        this.animal = animal;
    }
    
    public void checkup(){
        this.animal.toString();
        this.animal.equals(null);
        //T의 타입을 메서드를 정의하는 시점에는 알수 없다. Object의 기능만 사용
//        System.out.println("동물 이름 = " + animal.getName());
//        System.out.println("동물 크기 = " + animal.getSize());
//        this.animal.sound();
    }
    
    public T bigger(T target) {
        //컴파일 오류
//        if (animal.getSize() > target.getSize()) {
//            return this.animal;
//        }
//        return target;
        return null;
    }
}
