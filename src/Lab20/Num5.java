package Lab20;

public class Num5 {
    public static void main(String[] args) {
        System.out.println("Основной поток запущен");
        Num3Cl mt1 = new Num3Cl("#child1");
        Num3Cl mt2 = new Num3Cl("#child2");
        Num3Cl mt3 = new Num3Cl("#child3");
        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Главный поток приостановлен");
            }
        }while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());
        System.out.println("Главный поток закончил исполнение");
    }
}
