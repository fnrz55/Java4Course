package Lab21.Num1;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int cost = 0;
        try {
            while (flag) {
                System.out.println("Выберите вид транспорта:\nМашина\nГрузовик\nСамолет\nПоезд\nЛодка\n");
                String tr = sc.nextLine().toUpperCase();
                Transport tp = Transport.valueOf(tr);
                switch (tp) {
                    case CAR:
                        System.out.println("Автомобиль переозит людей");
                        cost = 3;
                        flag = false;
                        break;
                    case TRACK:
                        System.out.println("Грузовики предназначены для перевозки грузов . В них путешествовать некомфортно, но если зажмуриться, то можно. \nНо, к сожалению, наша компания таких услуг не предоставляет. Рекомендуем вам обратить внимание на другой вид транспорта");
                        cost = 5;
                        flag = true;
                        break;
                    case PLANE:
                        System.out.println("Самолет летит");
                        cost = 4;
                        flag = false;
                        break;
                    case TRAIN:
                        System.out.println("Поезд движется по рельсам");
                        cost = 3;
                        flag = false;
                        break;
                    case BOAT:
                        cost = 6;
                        System.out.println("Лодка плывет по воде");
                        flag = false;
                        break;
                    default:
                        flag = false;
                        break;
                }
                System.out.println("Желаете ли вы расчитать стоимость поездки, если да введите 1, если нет введите любую цифку");
                int ans = sc.nextInt();
                switch (ans) {
                    case 1:
                        System.out.println("Введите расстояние: ");
                        int km = sc.nextInt();
                        System.out.println("Стоимость поездки: " + cost * km);
                        break;
                    default:
                        break;
                }
            }

        }catch (Exception e){
            System.out.println("Ошибка " + e.getMessage());
        }

    }
}
