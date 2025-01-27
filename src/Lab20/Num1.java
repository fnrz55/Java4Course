package Lab20;

public class Num1 {
    public static void main(String[] args) {
        System.out.println("Основной поток запущен");
        Num1Cl mt=new Num1Cl("#Child1");
        Thread newThrd=new Thread(mt);
        newThrd.start();
        for (int i = 0; i <50 ; i++) {
            System.out.println(".");

            try {
                Thread.sleep(100);
            }catch (InterruptedException e ){
                System.out.println("Главный поток приостановлен");
            }
        }
        System.out.println("Главный поток закончил исполнение");
    }
}
