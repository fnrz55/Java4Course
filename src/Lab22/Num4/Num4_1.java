package Lab22.Num4;



public class Num4_1 <T extends Number>{
    T num;
    Num4_1 (T n){
        num = n;
    }
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    double fraction() {
        return  num.doubleValue() - num.intValue();
    }
}
