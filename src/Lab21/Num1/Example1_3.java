package Lab21.Num1;
enum Transport3 {CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int avspeed;
    Transport3(int s) {avspeed= s;}
    int getAvspeed() {return avspeed;}
}
public class Example1_3 {
    public static void main(String[] args) {
        Transport3 tp;
        System.out.println("Типичная скорость самолета: " + Transport3.AIRPLANE.getAvspeed( ) + " миль в час\n");
        System.out.println("Типичная скорость движения транспортных средств");
        for (Transport3 t : Transport3.values())
            System.out.println(t + ": " + t.getAvspeed() + " миль в час");
    }
}
