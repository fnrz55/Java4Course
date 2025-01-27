package Num3;


public class Example3_5 {
    public static void main(String[] args) {
        double a, b, c, x;
        a = 4;
        b = 1;
        c = -3;
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * c);
        System.out.println("Первый корень: " + x);
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * c);
        System.out.println("Второй корень: " + x);
    }
}
