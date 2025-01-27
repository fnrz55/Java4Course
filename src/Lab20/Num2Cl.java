package Lab20;

public class Num2Cl implements Runnable {
Thread thrd;
Num2Cl(String name){
    thrd=new Thread(this,name);
    thrd.start();
}
public void run(){
    System.out.println("Поток " + thrd.getName() + " начал исполнение");
    try{
        for (int i = 0; i < 10 ; i++) {
            Thread.sleep(400);
            System.out.println("В потоке " + thrd.getName() + " счетчик " + i);
        }
    }catch (InterruptedException e){
        System.out.println("Поток " + thrd.getName() + " приостановлен");
    }
    System.out.println("Поток " + thrd.getName() + " прекратил исполнение");
}
}