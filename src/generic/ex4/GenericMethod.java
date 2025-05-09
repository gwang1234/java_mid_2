package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T>T genericMethod(T t) {
        System.out.println("Generic print: " + t);
        return t;
    }

    public static <T extends Number>T NumberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }

}
