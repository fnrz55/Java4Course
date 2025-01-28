package Lab21.Num1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Transport tp = Transport.CAR;
        boolean track = false;
        boolean flag = true;
        Transport[] transportArray = Transport.values();
        while (flag) {
            System.out.println("Выберите вид транспорта:\n1 - Машина\n2 - Грузовик\n3 - Самолет\n4 - Поезд\n5 - Лодка\n-1 - Выход из программы");
            String tr = br.readLine();
            try {
                int trNum = Integer.parseInt(tr);
                try {
                    tp = transportArray[trNum - 1];
                    System.out.println(tp.getMessage());
                    if (tp != Transport.TRACK) {
                        track = true;
                    }
                    flag = false;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Выбрано некорректное значение, выберите из предложенных вариантов");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение");
            }
        }
        if (track) {
            flag = true;
            System.out.println("Желаете ли вы расчитать стоимость поездки ? y - да, n -  нет");
            String ans = br.readLine();
            while (flag) {
                if (ans.equals("y")) {
                    System.out.println("Введите расстояние: ");
                    String km = br.readLine();
                    try {
                        int kmNum = Integer.parseInt(km);
                        System.out.println("Стоимость поездки: " + tp.getCost() * kmNum);

                    } catch (NumberFormatException e) {
                        System.out.println("Введено некорректное значение");
                        continue;
                    }
                }
                flag = false;
            }
        }
    }
}
