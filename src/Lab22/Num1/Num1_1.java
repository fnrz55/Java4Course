package Lab22.Num1;

public class Num1_1<T> {
    T ob;
    Num1_1 (T o) {
        ob = o;
    }
    T getob () {
        return ob;
    }
    void showType() {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}
