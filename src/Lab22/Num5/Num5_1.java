package Lab22.Num5;

public class Num5_1 <T extends Number> {
    T num;
    Num5_1 ( T n){
        num = n;
    }
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    boolean absEqual(Num5_1<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
        //Разные типы, а передается один
//    boolean absEqual(Num5_1<T> ob){
//        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
//            return true;
//        return false;
//    }
}
