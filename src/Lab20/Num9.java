package Lab20;

public class Num9 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        Num9Th mt1 = new Num9Th("#Child1",a);
        Num9Th mt2 = new Num9Th("#Child2",a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Прерывание основного потока");
        }
    }
}