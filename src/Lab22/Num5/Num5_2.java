package Lab22.Num5;

public class Num5_2 {
    public static void main(String args[]) {
        Num5_1<Integer> Ob1 = new Num5_1<Integer>(6);
        Num5_1<Double> Ob2 = new Num5_1<Double>(-6.0);
        Num5_1<Long> Ob3 = new Num5_1<Long>(5L);
        System.out.println("Сравнение Ob1 и Ob2");
        if (Ob1.absEqual(Ob2))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");
        System.out.println();
        System.out.println("Сравнение Ob1 и Ob2.");
        if(Ob1.absEqual(Ob2))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");
    }
}
