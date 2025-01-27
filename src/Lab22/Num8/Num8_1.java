package Lab22.Num8;

public class Num8_1 {
    private int sum;
    <T extends Number> Num8_1(T arg){
        sum = 0;
        for(int i = 0; i <= arg.intValue(); i++)
            sum += i;
//        sum = (1 + arg.intValue())*(arg.intValue()/2);
    }
    int getSum(){
        return sum;
    }
}
