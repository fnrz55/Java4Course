package Lab22.Num4;

public class Num4_2 {
    public static void main(String args[]) {
        Num4_1<Integer> iOb = new Num4_1<Integer>(5);
        System.out.println("Обратная величина iOb - " + iOb.reciprocal());
        System.out.println("Дробная величина iOb - " + iOb.fraction());
        System.out.println();
        Num4_1<Double> dOb = new Num4_1<Double>(5.25);
        System.out.println("Обратная величина dOb - " + dOb.reciprocal());
        System.out.println("Дробная величина dOb - " + dOb.fraction());
        Num4_3<String> strOb = new Num4_3<String>("Ошибка");
        System.out.println("Строка - "+ strOb.getStr());
    }
}
