package Lab22.Num9;

public class Num9_1<T extends Number> implements Containment<T> {
//public class Num9_1<T> implements Containment<T> {
    T[] arreyRef;
    Num9_1(T[] o) {
        arreyRef = o;
    }

    @Override
    public boolean contains(T o) {
        for (T x : arreyRef)
            if(x.equals(o)) return true;
        return false;
    }
}
