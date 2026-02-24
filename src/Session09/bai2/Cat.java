package Session09.bai2;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Meo meo");
    }
}
