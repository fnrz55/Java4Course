package Lab22.Num1;

public class Num1_2 {
    public static void main(String args[]) {
        Num1_1<Integer> iOb;
        iOb = new Num1_1<Integer>( 88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println("значение " + v);
        System.out.println();
        Num1_1<String> strOb = new Num1_1<String>("“естирование обобщений");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("значение " + str);
    }
}
