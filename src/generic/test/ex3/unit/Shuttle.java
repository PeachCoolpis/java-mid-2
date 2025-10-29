package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit>{
    
    private T value;
    
    public void in(T value){
        this.value = value;
    }
    
    public void showInfo(){
        String format = String.format("이름: %s, HP: %s", this.value.getName(), this.value.getHp());
        System.out.println(format);
    }
}
