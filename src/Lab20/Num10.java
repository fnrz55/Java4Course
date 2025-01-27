package Lab20;

public class Num10 {
    public static void main(String[] args) {
        Num10Cl tt = new Num10Cl();
        Num10Th flow1 = new Num10Th("tick", tt);
        Num10Th flow2 = new Num10Th("tack", tt);
        try {
            flow1.thrd.join();
            flow2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Прерывание основного потока");
        }
    }
}
