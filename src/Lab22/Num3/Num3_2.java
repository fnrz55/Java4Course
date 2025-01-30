package Lab22.Num3;

public class Num3_2<T extends Number> {
    T num;

    Num3_2(T n) {
        num = n;
    }

    double recip() {
        return 1 / num.doubleValue();
    }
    double fraction () {
        return num.doubleValue() -num.intValue();
    }
}
