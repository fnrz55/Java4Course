package Lab21.Num1;

enum Transport2{CAR, TRUCK, AIRPLANE, TRAIN, BOAT}

public class Example1_2 {
    public static void main(String[] args) {
        Transport2 tp;
        System.out.println("Константы Transport: ");
        Transport2[] allTransports1 = Transport2.values();
        for (Transport2 t : allTransports1)
            System.out.println(t);
            System.out.println();
            tp = Transport2.valueOf("AIRPLANE");
            System.out.println("tp содержит " + tp);
    }
}
