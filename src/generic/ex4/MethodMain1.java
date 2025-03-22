package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        Integer integerValue = GenericMethod.<Integer>NumberMethod(i);
        Double doubleValue = GenericMethod.<Double>NumberMethod(20.0);

        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.NumberMethod(i);
        Double doubleValue1 = GenericMethod.NumberMethod(20.0);
    }
}
