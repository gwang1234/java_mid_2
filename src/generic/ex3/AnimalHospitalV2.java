package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서들르 정의하는 시점에는 알 수 없다. Object만 기능만 가능
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
        animal.toString();
        animal.equals(null);
    }

    public T bigger(T target) {
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
