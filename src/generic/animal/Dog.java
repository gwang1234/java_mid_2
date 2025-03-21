package generic.animal;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public Dog(String name, int size) {
        super(name, size);
    }
}
