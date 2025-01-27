package Lab20;

public class Num11 {
    public static void  main(String[] args) {
        Num11Th fl1 = new Num11Th("Num11Th");
        try {
            Thread.sleep(1000);
            fl1.mysus1();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);
            fl1.mysres();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);
            fl1.mysus1();
            System.out.println("Приостановление потока");
            Thread.sleep(1000);
            fl1.mysres();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);
            fl1.mysus1();
            System.out.println("Остановка потока");
            fl1.myst1();
        }catch (InterruptedException e){
            System.out.println("Прерывание основного потока");
        }
        try {
            fl1.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Выход из основного потока");
    }
}
