package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포힘 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
