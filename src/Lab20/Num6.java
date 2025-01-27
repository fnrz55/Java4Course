package Lab20;

public class Num6 {
    public static void main(String[] args) {
        System.out.println("Основной поток запущен");
        Num3Cl mt1 = new Num3Cl("#child1");
        Num3Cl mt2 = new Num3Cl("#child2");
        Num3Cl mt3 = new Num3Cl("#child3");
    try {
        mt1.join();
        System.out.println("#child 1 connected");
        mt2.join();
        System.out.println("#child 2 connected");
        mt3.join();
        System.out.println("#child 3 connected");
    }catch (InterruptedException e){
        System.out.println("Главный поток приостановлен");
    }
        System.out.println("Главный поток закончил исполнение");
    }
}