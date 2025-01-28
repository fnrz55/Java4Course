package Lab21.Num1;

public class Example1_4 {
    public static void main(String[] args) {
        Transport4 tp, tp2, tp3;
        System.out.println("Константы перечисления Transport и их порядковые значения");
        Transport4[] allTransports4 = Transport4.values();
        for (Transport4 t : Transport4.values())
            System.out.println(t + " " + t.ordinal());
        tp = Transport4.AIRPLANE;
        tp2 = Transport4.TRAIN;
        tp3 = Transport4.AIRPLANE;
        System.out.println();
        if (tp.compareTo(tp2) < 0)
            System.out.println(tp + " идет перед " + tp2);
        if (tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " идет перед " + tp);
        if (tp.compareTo(tp3) == 0)
            System.out.println(tp + " совпадает с " + tp3);
    }
}
