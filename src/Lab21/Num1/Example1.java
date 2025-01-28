package Lab21.Num1;
import java.io.DataInputStream;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        DataInputStream dis = new DataInputStream(System.in);
        Transport tp = Transport.CAR;
        boolean track = false;
        boolean flag = true;
        int cost = 0;
        Transport[] transportArray = Transport.values();
        try {
            while (flag) {
                int trNum = 0;
                try {
                    System.out.println("Выберите вид транспорта:\n1 - Машина\n2 - Грузовик\n3 - Самолет\n4 - Поезд\n5 - Лодка\n-1 - Выход из программы");
                    trNum = dis.readInt();
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
            if(track){
                flag = true;
                System.out.println("Желаете ли вы расчитать стоимость поездки ? 1 - да, -1 -  нет");
                while (flag){
                    int ans = 0;
                    try{
                        ans = dis.readInt();
                        if (ans == 1){
                            System.out.println("Введите расстояние: ");
                            int km = dis.readInt();
                            System.out.println("Стоимость поездки: " + tp.getCost() * km);
                        }
                        flag = false;
                    }catch (NumberFormatException e){
                        System.out.println("Введено некорректное значение");
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Ошибка " + e.getMessage());
        }

    }
}
