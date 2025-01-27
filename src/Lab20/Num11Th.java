package Lab20;

public class Num11Th implements Runnable {
    Thread thrd;
    volatile boolean susp1;
    volatile boolean stopp;
    Num11Th(String name) {
        thrd = new Thread(this, name);
        susp1 = false;
        stopp = false;
        thrd.start();
    }
    public void run(){
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int i = 0; i < 1000; i++){
                System.out.print(i + " ");
                if ((i % 10) == 0){
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this){
                    while (susp1){
                        wait();
                    }
                    if(stopp) break;
                }
            }
        }catch (InterruptedException exc){
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - выход");
    }
    synchronized void myst1() {
        stopp = true;
        susp1 = false;
        notify();
    }
    synchronized void mysus1(){
        susp1 = true;
    }
    synchronized void mysres(){
        susp1 = false;
        notify();
    }
}
