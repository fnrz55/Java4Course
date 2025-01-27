package Lab20;

public class Num3 {
    public static void main(String[] args) {
    	System.out.println("Главный поток запущен");
        Num3Cl th = new Num3Cl("#child3");
        for (int i = 0; i < 50 ; i++) {
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